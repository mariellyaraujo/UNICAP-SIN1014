package atvsClasse.atvPolimorfismo;

public class Cachorro extends Animal{
    
    @Override
    public String fazerSom(){
        return "o cachorro faz: AuAu";
    }

    public String abanarRabo(){
        return "o cachorro abana o rabo";
    }
}
