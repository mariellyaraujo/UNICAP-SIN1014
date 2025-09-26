package Lista02;
import java.util.ArrayList;
import java.util.Scanner;
public class Zoo {
    Scanner s = new Scanner(System.in);

    private ArrayList<Animal> animals;

    public Zoo (ArrayList<Animal> animals){
        setAnimals(animals); 
    }

    public void setAnimals(ArrayList<Animal> animals){
        this.animals = animals;
    }
    public ArrayList<Animal> getAnimals(){
        return this.animals;
    }

    public void addAnimal(Animal animal){
        animals.add(animal);
    }

    public ArrayList<Animal> listAnimals(){
        return animals;
    }

    public boolean removeAnimal(long id){
        for (Animal animal : animals) {
            if (animal.getId() == id) {
                animals.remove(animal);
                return true;
            }
        }
        return false;
    }
}
