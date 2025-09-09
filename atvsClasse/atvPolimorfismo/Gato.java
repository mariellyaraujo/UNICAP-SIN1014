package atvsClasse.atvPolimorfismo;

public class Gato extends Animal{
    
    @Override
    public void fazerSom(){
        System.out.println("o gato faz: Miau Miau");
    }

    public void arranharMoveis(){
        System.out.println("o gato arranha os móveis");
    }

}
