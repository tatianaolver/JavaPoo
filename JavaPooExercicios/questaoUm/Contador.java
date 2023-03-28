package questaoUm;

public class Contador {
    int num;

    public Contador(int num){
        this.num = num;
    }

    public void incrementar(){
        this.num ++;
    }

    public void zerar(){
        this.num = 0;
    }

    public int getNum(){
        return num;
    }

}