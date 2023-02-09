package curso_poo;

public class Caneta {
   public String modelo;
    public String cor;
    private double ponta = 0.5;
    private int carga = 2;
    public boolean tampada;

    public void status(){
        System.out.println("modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Tampada? " + this.tampada);
    }
   public void rabiscar(){
        if (tampada == true){
            System.out.println("ERRO, caneta tampada");
        }else {
            System.out.println("RABISCO, caneta destampada");
        }
    }
    public void tampar(){
        tampada = true;
    }
   public void  destampar(){
        tampada = false;
    }
}
