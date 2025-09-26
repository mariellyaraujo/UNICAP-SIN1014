package Lista02;

import java.util.ArrayList;
public class Cat extends Animal{

    ///construtor
    public Cat(long id, int age, double weight) {
        super(id, "Whiskers", age, weight);
        abilities.add("agility");
    }

    @Override
    public String sound(){
        return "meow";
    }
}
