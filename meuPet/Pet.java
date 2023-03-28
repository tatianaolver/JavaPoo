public class Pet {
    public String nome;
    public String classe;
    public String familia;
    public int idade;
    public boolean estado;
    public int caloria;
    public int forca;

    public Pet(String nome, String classe, String familia){
        this.nome = nome;
        this.classe = classe;
        this.familia = familia;
        this.idade = 0;
        this.estado = true;
        this.caloria = 10;
        this.forca = 10;
    }

    public String morrer(){
        this.forca = 0;
        this.estado =  false;
        return "O seu pet morreu! :(";
    }

        public String comer(){
            if(estado==true && caloria <100 && forca>0){
                this.caloria += 10;
                this.forca -= 2;
                if(forca<=0){
                    morrer();
                }
                return "O seu pet está alimentado e agora sua força é de: " + this.forca + " e suas calorias de: " +this.caloria;
        } 
        else{
            return morrer();
        }
    }
        public String passear(){
            if(estado==true && caloria>0) {
                this.forca -= 5;
                this.caloria -= 5;
                if(this.forca<=0){
                    morrer();
                }
                return "O pet está passeando! Agora sua força é de: "+ this.forca + " e suas calorias de: " +this.caloria;
        }
        else{
            return morrer();
        }
    }

        public String dormir(){
            if(estado == true){
                this.forca += 10;
                this.caloria -= 2;
                return "O seu pet está dormindo! Sua força está de: " +this.forca + " e suas calorias: " + this.caloria;
            
        }
        else{
            return morrer();
        }
    }

        @Override
        public String toString() {

            return 
            "O pet se chama: " + this.nome +
            ".\nÉ da classe: " + this.classe + 
            ".\nDa família: "  + this.familia + 
            ".\nO pet possui força de: " + this.forca + 
            ".\nCaloria de: " + this.caloria +
            "\nE idade de: " + this.idade + ".";
    }
}
