package Lista02;

import java.util.ArrayList;

public class Zoo {
    private ArrayList<Animal> animals;

    public Zoo() {
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public ArrayList<Animal> listAnimals() {
        return animals;
    }

    public boolean removeAnimal(long id) {
        for (Animal a : animals) {
            if (a.getId() == id) {
                animals.remove(a);
                return true;
            }
        }
        return false;
    }
}
