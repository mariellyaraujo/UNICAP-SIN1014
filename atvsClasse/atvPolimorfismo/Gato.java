package atvsClasse.atvPolimorfismo;

public class Gato extends Animal{
    
    @Override
    public String fazerSom(){
        return "o gato faz: Miau Miau";
    }

    public String arranharMoveis(){
        return "o gato arranha os móveis";
    }

}
