package animalworld;

import java.io.Serializable;

public class Predators extends Animal implements Serializable{
    public Predators(int id, String name, float a) {
        super(id, name, a);
    }

    public Predators() {

    }

    public void eat(Food food) {
        if (!(food instanceof Herbivores))
            throw new IllegalArgumentException("Животное " + name + " не может это есть");

        if (!((Herbivores) food).isAlive)
            throw new IllegalArgumentException("Травоядное " + ((Herbivores) food).name + " уже погибло");


        Herbivores meat = (Herbivores) food;

        meat.die();
        m += meat.getM();
        meat.setM(0);
        System.out.println("Животное " + name + " поел " + meat.name);

    }
}
