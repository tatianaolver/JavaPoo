package questaoDois;

public class Primos {
    int num;
    int contador;

    Primos(int num) {
        this.num = num;
    }

    public boolean isPrimo(){
        for(int i = 1; i <=num; i++){
            if(num%i==0){
                contador ++;
            }
        }
        if(contador==2){
            return true;
        }
        else return false;
    }
}
