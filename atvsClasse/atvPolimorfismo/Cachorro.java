package atvsClasse.atvPolimorfismo;

public class Cachorro extends Animal{
    
    @Override
    public void fazerSom(){
        System.out.println("o cachorro faz: AuAu");
    }

    public void abanarRabo(){
        System.out.println("o cachorro abana o rabo");
    }
}
