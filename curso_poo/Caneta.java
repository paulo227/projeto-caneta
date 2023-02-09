package curso_poo;

public class Caneta {
    String modelo;
    String cor;
    double ponta;
    int carga;
    boolean tampada;

    void status(){
        System.out.println("modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Tampada? " + this.tampada);
    }
    void rabiscar(){
        if (tampada == true){
            System.out.println("ERRO, caneta tampada");
        }else {
            System.out.println("RABISCO, caneta destampada");
        }
    }
    void tampar(){
        tampada = true;
    }
    void  destampar(){
        tampada = false;
    }
}
