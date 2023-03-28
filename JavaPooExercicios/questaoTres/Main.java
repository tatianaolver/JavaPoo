package questaoTres;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a abcissa A: ");
        double xA = scanner.nextInt();
        System.out.println("Informe a abcissa A: ");
        double yA = scanner.nextInt();

        System.out.println("Informe a ordenada B: ");
        double xB = scanner.nextInt();
        System.out.println("Informe a ordenada B: ");
        double yB = scanner.nextInt();

        Pont2D p = new Pont2D(xA,yA,xB,yB);

        System.out.println("Distância entre o ponto A e a origem: " + p.distanciaEntrePontosEOrigem());

        System.out.println("Distância entre os pontos A e B: " + p.distanciaEntrePontos()); 
        
        scanner.close();
    }
}
