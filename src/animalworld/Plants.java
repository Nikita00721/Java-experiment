package animalworld;

import java.io.Serializable;

public class Plants implements Food, Serializable {
    int id;
    String name;
    float m;
    boolean isAlive;
    public Plants(int id,String name,float m){
        if (m<0)
            throw new IllegalArgumentException("Растение"+ this.name +"не может существовать с такой массой");
        this.id=id;
        this.m=m;
        this.name=name;
    }

    public Plants() {

    }
    public String getInfo(){
        return "id = " + id + " Растение " + name + " с массой " + m ;
    }
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

