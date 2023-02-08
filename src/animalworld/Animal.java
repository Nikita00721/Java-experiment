package animalworld;

import java.io.Serializable;

public abstract class Animal implements Serializable {
    protected int id;
    protected String name;
    protected float m;
    protected boolean isAlive;

    public Animal(int id,String name,float a){
        if (m<0)
            throw new IllegalArgumentException("Животное "+ this.name +" не может рождаться с отрицательной массой");
        this.id=id;
        this.m=m;
        this.name=name;
        this.isAlive=true;
    }
    public Animal(){

    }
    public void die(){
        if (!isAlive)
            throw new IllegalArgumentException("Животное "+ name +" погибло. Его нельзя убить");
        isAlive=false;
    }

    public String getInfo(){
        return "id = " + id + " Животное " + name + (this.isAlive()?" Жив ":" Погиб");
    }
    public abstract void eat(Food food);

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getM() {
        return m;
    }

    public void setM(float m) {
        this.m = m;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
}


