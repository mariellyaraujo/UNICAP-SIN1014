package atvsClasse.atvPolimorfismo;

public class Petshop {
    public static void main(String[] args){
        Animal[] animais = new Animal[2];

        Animal c = new Cachorro();
        Animal g = new Gato();

        animais[0] = c;
        animais[1] = g;

        Petshop.interagirComAnimais(animais);
    }

    public static void interagirComAnimais(Animal[] animais){
        for(int i = 0; i < animais.length; i++){
            animais[i].fazerSom();

            if(animais[i] instanceof Cachorro){
                ((Cachorro)animais[i]).abanarRabo();
            } else if (animais[i] instanceof Gato){
                ((Gato)animais[i]).arranharMoveis();
            }
        }
    }
}
