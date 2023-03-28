package questaoTres;

public class Pont2D {
    double abcissaA;
    double ordenadaA;
    double abcissaB;
    double ordenadaB;

    public Pont2D(){

    }

    public Pont2D(double abcissaA, double ordenadaA, double abcissaB, double ordenadaB){
        this.abcissaA = abcissaA;
        this.ordenadaA = ordenadaA;

        this.abcissaB = abcissaB;
        this.ordenadaB = ordenadaB;
    }

    public double distanciaEntrePontosEOrigem(){
        double resultado;
        double x1 = abcissaA - 0;
        double x2 = ordenadaA - 0;

        resultado = Math.sqrt((x1*x1) + (x2*x2));
        return resultado;
    }

    public double distanciaEntrePontos(){
        double resultado;
        double x1 = abcissaA - abcissaB;
        double x2 = ordenadaA - ordenadaB;

        resultado = Math.sqrt((x1*x1) + (x2*x2));
        return resultado;
    }
}
