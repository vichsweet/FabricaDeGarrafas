public class Caixa{
    //atributo
    int quantGarrafas;
    Esteira esteira;
    
    
    Caixa(Esteira esteira){
        this.esteira = esteira;
    }
    //método
    
    
    void addGarrafas(){
        quantGarrafas ++;
        if (quantGarrafas == 3){
            esteira.ligar();
            esteira.entrega();
            esteira.desligar();
        }
    }
}