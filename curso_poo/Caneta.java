package curso_poo;

public class Caneta {
   public String modelo;
    public String cor;
    private double ponta = 0.5;
    private int carga = 2;
    public boolean tampada;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPonta() {
        return ponta;
    }

    public void setPonta(double ponta) {
        this.ponta = ponta;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public Caneta(String modelo, String cor, boolean tampada) {
        this.modelo = modelo;
        this.cor = cor;
        this.tampada = tampada;
    }

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
