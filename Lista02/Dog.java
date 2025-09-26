package Lista02;

import java.util.ArrayList;

public class Dog extends Animal{
    public Dog(long id, int age, double weight) {
        super(id, "Buddy", age, weight);
        abilities.add("sniff");
    }

    @Override
    public String sound(){
        return "au";
    }
}
