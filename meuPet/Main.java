import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Pet pet = new Pet("Babidi","Gato","Tabby");
        System.out.println("Dados do Pet: ");
        System.out.println(pet);
        System.out.println("____________");
        System.out.println("Babidi nasceu, o que deseja fazer agora?");
        System.out.println("1 - Comer");
        System.out.println("2 - Passear");
        System.out.println("3 - Dormir");
        System.out.println("4 - Sair do programa");
        int resposta = scanner.nextInt();

        while(resposta!=4){
            if(resposta==1 || pet.forca <=0){
                System.out.println(pet.comer());
            }
            if(resposta==2){
                System.out.println(pet.passear());
            }
            if(resposta==3){
                System.out.println(pet.dormir());
            }
            if(resposta==4){
                System.out.println(pet.morrer());
                break;
            }
            System.out.println("_________");
            if(pet.forca<=0){
                System.out.println("O pet morreu :(");
                break;
            }
            else{
                System.out.println(pet);
                System.out.println("________");
                System.out.println("O que Babidi vai fazer?");
                System.out.println("1 - Comer");
                System.out.println("2 - Passear");
                System.out.println("3 - Dormir");
                System.out.println("4 - Sair do programa");
                resposta = scanner.nextInt();
            
            }   
        }
        scanner.close();

    }
}