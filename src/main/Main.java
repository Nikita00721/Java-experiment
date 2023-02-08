package main;

import animalworld.Herbivores;
import animalworld.Plants;
import animalworld.Animal;
import animalworld.Predators;
import form.Listener;
import form.Formik;
import storage.Forest;

import java.io.*;


public class Main {
    public static void main(String[] args) throws EOFException,IOException,ClassNotFoundException {

        Formik sf = new Formik();
        Listener sf1=new Listener(sf);

        Forest forest = Forest.getInstance();
        String f = "file2.bin";
            BufferedReader r = new BufferedReader(new FileReader(f));
            if(r.readLine()==null){
                System.out.println("Файл пуст");
                Formik.getB1().removeAll();Formik.getB2().removeAll();Formik.getB3().removeAll();Formik.getB4().removeAll();
            }
            else {
                //forest.createDefaultForest();
                forest.load();
                java.util.ArrayList<Herbivores> listherb = Forest.getInstance().findAllAliveHerbivores();
                java.util.ArrayList<Predators> listpr = Forest.getInstance().findAllPredator();
                java.util.ArrayList<Plants> listpl = Forest.getInstance().findAllAlivePlants();
                for (Predators an:listpr){
                    Formik.getB1().add(an.getName());
                }
                for (Herbivores an:listherb){
                    Formik.getB2().add(an.getName());
                    Formik.getB4().add(an.getName());
                }
                for(Plants an:listpl){
                    Formik.getB3().add(an.getName());
                }


            }

    }
    }


