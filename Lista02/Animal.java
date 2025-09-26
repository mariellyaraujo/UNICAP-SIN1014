package Lista02;

import java.util.ArrayList;

public abstract class Animal {
    private long id;
    private String name;
    private int age;
    private double weight;
    private ArrayList<String> abilities;

    ////construtur
    public Animal (long id, String name, int age, double weight, ArrayList<String> abilitiees){

    }
    /// setters
    public void setId(long id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public void setAbilities (ArrayList<String> abilities){
        this.abilities = abilities;
    }
    /// getters
    public long getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public double getWeight(){
        return this.weight;
    }
    public ArrayList<String> getAbilities(){
        return this.abilities;
    }

    ///metodos
    public abstract String sound();

    public String performAbility(String ability){
        if(abilities.contains(ability) == true){
            return getName() + " can " + ability;
        } else {
            return getName() + " can't " + ability;
        }
    }
}
