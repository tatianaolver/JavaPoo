package questaoUm;

public class Main {
    public static void main(String[] args) {
        Contador c = new Contador(2);

        System.out.println("Valor: " + c.getNum());
        c.incrementar();
        System.out.println("Valor incrementado: " + c.getNum());
        System.out.println("Zerando o valor...");
        c.zerar();
        System.out.println("Valor zerado: " + c.getNum());
    }
}
