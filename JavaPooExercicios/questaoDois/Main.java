package questaoDois;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um número inteiro para verificar se ele é primo: ");
        int num = scanner.nextInt();

        Primos p = new Primos(num);
        System.out.println(p.isPrimo());

        scanner.close();
    }
}
