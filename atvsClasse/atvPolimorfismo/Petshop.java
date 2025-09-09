package atvsClasse.atvPolimorfismo;

public class Petshop {
    public static void main(String[] args){
        Animal[] animais = new Animal[2];

        Cachorro c = new Cachorro();
        Gato g = new Gato();

        animais[0] = c;
        animais[1] = g;
    }
}
