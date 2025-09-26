package Lista02;

import java.util.ArrayList;

public class Bird extends Animal{

    public Bird(long id, int age, double weight) {
        super(id, "Tweety", age, weight);
        abilities.add("fly");
    }

    @Override
    public String sound(){
        return "piu";
    }
}
