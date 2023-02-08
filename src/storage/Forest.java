package storage;

import animalworld.Herbivores;
import animalworld.Plants;
import animalworld.Predators;

import java.io.*;
import java.util.ArrayList;
import java.io.Serializable;

public class Forest implements Serializable{
    private int id;
    private static Forest forest = null;
    ArrayList<Predators> pr=new ArrayList<Predators>();
    ArrayList<Herbivores> herb=new ArrayList<Herbivores>();
    ArrayList<Plants> pl=new ArrayList<Plants>();


    protected String f ="file2.bin";


    public void save() throws IOException {
        FileOutputStream r_file1 = new FileOutputStream(f);
        ObjectOutputStream potok1 = new ObjectOutputStream(r_file1);
        potok1.writeObject(forest);
        r_file1.close();
        potok1.close();
    }

    public Forest load() throws IOException, ClassNotFoundException {
        FileInputStream r_file2 = new FileInputStream(f);
        ObjectInputStream potok2 = new ObjectInputStream(r_file2);
        var tmp =(Forest) potok2.readObject();
        forest = tmp;
        r_file2.close();
        potok2.close();
        return forest;
    }

    public void createDefaultForest(){
        forest.createPlants("Трава",150);
        forest.createPredator("Волк",26);
        forest.createHerbivores("Заяц",10);
    }

    public Predators createPredator(String name, float m) {
        Predators predator = new Predators(id++, name, m);
        pr.add(predator);
        System.out.println("Животное " + name + " создалось с массой:"+m);
        return predator;
    }
    public static Forest getInstance(){
        if (forest == null) {
            forest = new Forest();
    }
        return forest;
    }

    public Plants createPlants(String name, float m) {
        Plants plants = new Plants(id++, name, m);
        pl.add(plants);
        System.out.println("Растение " + name + " создалось с массой:"+m);
        return plants;
    }

    public Herbivores createHerbivores(String name, float m) {
        Herbivores herbivore = new Herbivores(id++, name, m);
        herb.add(herbivore);
        System.out.println("Животное " + name + " создалось с массой:"+m);
        return herbivore;
    }
    public String showAll() {
        String str = "\nХищники:\n";
        if (getPr().isEmpty())
            str += "\nПусто\n";
        else
            for (Predators an:pr)
                str += an.getInfo() + "\n";
        str += "\nТравоядные:\n";
        if (getHerb().isEmpty())
            str += "\nПусто\n";
        else
            for (Herbivores an:herb)
                str += an.getInfo() + "\n";
        str += "\nРастения:\n";
        if (getPl().isEmpty())
            str += "\nПусто\n";
        else
            for (Plants an:pl)
                str += an.getInfo() + "\n";
        return str;
    }
    public String showPredator() {
        String str = "\nХищники:\n";
        if (getPr().isEmpty())
            str += "\nПусто\n";
        else
            for (Predators an:pr)
                str += an.getInfo() + "\n";
        return str;
    }

    public String showHerbivore() {
       String str = "\nТравоядные:\n";
        if (getHerb().isEmpty())
            str += "\nПусто\n";
        else
            for (Herbivores an:herb)
                str += an.getInfo() + "\n";
            return str;
    }

    public String showPlants() {
        String str = "\nРастения:\n";
        if (getPl().isEmpty())
            str += "\nПусто\n";
        else
            for (Plants an:pl)
                str += an.getInfo() + "\n";
        return str;
    }

    public String showAlive() {
        String str = "\nЖивые Хищники:\n";
        if (getPr().isEmpty())
            str += "\nПусто\n";
        else
            for (Predators an:pr)
                if (an.isAlive())
                    str += an.getInfo() + "\n";
        str += "\nЖивые Травоядные:\n";
        if (getHerb().isEmpty())
            str += "\nПусто\n";
        else
            for (Herbivores an:herb)
                if (an.isAlive())
                    str += an.getInfo() + "\n";
        str += "\nРастения:\n";
        if (getPl().isEmpty())
            str += "\nПусто\n";
        else
            for (Plants an:pl)
                str += an.getInfo() + "\n";
        return str;
    }


    public String showAlivePredator() {
        String str = "\nЖивые Хищники:\n";
        if (getPr().isEmpty())
            str += "\nПусто\n";
        else
            for (Predators an:pr)
                if (an.isAlive())
                    str += an.getInfo() + "\n";
        return str;
    }

    public String showAliveHerbivore() {
        String str = "\nЖивые Травоядные:\n";
        if (getHerb().isEmpty())
            str += "\nПусто\n";
        else
            for (Herbivores an:herb)
                if (an.isAlive())
                    str += an.getInfo() + "\n";
        return str;
    }


    public ArrayList<Object> findAll(){
        ArrayList<Object> list=new ArrayList<Object>();
            list.addAll(herb);
            list.addAll(pr);
            list.addAll(pl);
        return list;
    }

    public ArrayList<Predators> findAllPredator(){

        return new ArrayList<Predators>(pr);
    }


    public ArrayList<Plants> findAllPlants(){

        return new ArrayList<Plants>(pl);
    }


    public ArrayList<Herbivores> findAllHerbivores(){

        return new ArrayList<Herbivores>(herb);
    }

    public Predators findAllIdPredators(int id){
        for (Predators an:pr){
            if (an.getId()==id){
                return an;
            }
        }
        return null;
    }
    /*public int findAllNamesPredators(String name){
        for (Predators an:pr){
            if (an.getName()==name){
                return an.getId();
            }
        }
        return -1;
    }*/

    public Plants findAllIdPlants(int id){
        for (Plants an:pl){
            if (an.getId()==id){
                return an;
            }
        }
        return null;
    }

    public Herbivores findAllIdHerbivores(int id){
        for (Herbivores an:herb){
            if (an.getId()==id){
                return an;
            }
        }
        return null;
    }

    public ArrayList<Predators> findAllAlivePredators(){
        ArrayList<Predators> list=new ArrayList<>();
        for (Predators an:pr){
            if(an.isAlive()){
                list.add(an);

            }
        }
        return list;
    }

    public ArrayList<Plants> findAllAlivePlants(){
        ArrayList<Plants> list=new ArrayList<>();
        for (Plants an:pl){
            if(an.getM()>0){
                list.add(an);

            }
        }
        return list;
    }

    public ArrayList<Herbivores> findAllAliveHerbivores(){
        ArrayList<Herbivores> list=new ArrayList<>();
        for (Herbivores an:herb){
            if(an.isAlive()){
                list.add(an);

            }
        }
        return list;
    }


    public void updatePredator(Predators predators){
        for(Predators an: pr){
            if (an.getId()==predators.getId()) {
                pr.remove(an);
                pr.add(predators);
            }
            else throw new IllegalArgumentException("Объект не смог обновиться");

        }
    }
    public void updateHerbivore(Herbivores herbivores){
        for(Herbivores an: herb){
            if (an.getId()==herbivores.getId()){
                herb.remove(an);
                herb.add(herbivores);}

            else throw new IllegalArgumentException("Объект не смог обновиться");

        }
    }
    public void updatePlants(Plants grass){
        for(Plants an: pl){
            if (an.getId()==grass.getId()){
                pl.remove(an);
                pl.add(grass);
            }

            else throw new IllegalArgumentException("Объект не смог обновиться");

        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Predators> getPr() {
        return pr;
    }

    public void setPr(ArrayList<Predators> pr) {
        this.pr = pr;
    }

    public ArrayList<Herbivores> getHerb() {
        return herb;
    }

    public void setHerb(ArrayList<Herbivores> herb) {
        this.herb = herb;
    }

    public ArrayList<Plants> getPl() {
        return pl;
    }

    public void setPl(ArrayList<Plants> pl) {
        this.pl = pl;
    }

    public String getF() {
        return f;
    }

    public void setF(String f) {
        this.f = f;
    }
}
