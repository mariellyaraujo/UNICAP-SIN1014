package Lista02;

import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        Zoo listaAnimais = new Zoo();

        while(true){
        System.out.println("1 - Adicionar Animal\n2 - Listar todos os Animais\n3 - Remover Animal (por ID)\n4 - Emitir som (por ID)\n5 - Testar habilidade de um Animal (por ID)\n6 - Sair do programa");

        int opcao = s.nextInt();

        switch(opcao){
            case 1:
                System.out.println("Que animal você quer adicionar?\n1 - Gato\n2 - Cachorro\n3 - Pássaro");
                int opcaoAdd = s.nextInt();
                System.out.println("id:");
                long id = s.nextLong();
                s.nextLine();

                System.out.println("idade:");
                int idade = s.nextInt();
                s.nextLine();

                System.out.println("peso:");
                double peso = s.nextDouble();

                Animal animal = null;

                if (opcaoAdd == 1){
                    animal = new Cat(id, idade, peso);
                    listaAnimais.addAnimal(animal);
                } else if(opcaoAdd == 2) {
                    animal = new Dog(id, idade, peso);
                    listaAnimais.addAnimal(animal);
                } else if(opcaoAdd == 3) {
                    animal = new Bird(id, idade, peso);
                    listaAnimais.addAnimal(animal);

                } else {
                    System.out.println("Opção não encontrada!");
                }
                break;


            case 2:
                System.out.println(listaAnimais.listAnimals());
                break;

            case 3:
                long idAnimal = s.nextLong();
                System.out.println(listaAnimais.removeAnimal(idAnimal));
                break;

            case 4:
                System.out.println("Digite o ID do animal:");
                long idSom = s.nextLong();

                boolean encontrado = false;
                for (Animal a : listaAnimais.listAnimals()) {
                if (a.getId() == idSom) {
                    System.out.println(a.sound());
                    encontrado = true;
                    break; 
                    }
                }
                if (!encontrado) {
                    System.out.println("Animal não encontrado!");
                }
                break;
                
            case 5:
                System.out.println("Digite o ID do animal:");
                long idHab = s.nextLong();
                s.nextLine();

                System.out.println("Digite a habilidade a ser testada:");
                String habilidade = s.nextLine();

                boolean encontradoHab = false;

                for (Animal a : listaAnimais.listAnimals()) {
                    if (a.getId() == idHab) {
                        System.out.println(a.performAbility(habilidade));
                        encontradoHab = true;
                        break;
                    }
                }

                if (!encontradoHab) {
                    System.out.println("Animal não encontrado!");
                }
                break;

            case 6:
                System.exit(0);
                s.close();
                break;

            default:
                System.out.println("Opção não enconmtrada");
        }
        }
    
    }
    
}
