package animalworld;

import java.io.Serializable;

public class Herbivores extends Animal implements Food,Serializable {
    public Herbivores(int id, String name, float a) {
        super(id, name, a);
    }

    public Herbivores() {
    }

    public void eat(Food food) {
        if (!isAlive)
            throw new IllegalArgumentException("Нельзя покормить. Животное " + name + " мертво");
        if (!(food instanceof Plants))
            throw new IllegalArgumentException("Животное " + name + " не ест такой тип еды.");
        Plants grass = (Plants) food;
        if (grass.getM() <= 0)
            throw new IllegalArgumentException("Животное " + name +" не может это есть");

        m += (grass.getM());
        grass.setM(0);
        System.out.println("Животное " + name + " поел " + grass.name);



    }

}
