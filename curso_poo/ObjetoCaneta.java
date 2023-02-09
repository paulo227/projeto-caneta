package curso_poo;

public class ObjetoCaneta {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.carga = 2;
        c1.cor = "Azul";
        c1.modelo = "Bic";
        c1.ponta = 1.0;
        c1.tampada = true;
        c1.rabiscar();
        c1.status();
        System.out.println("----------------");
        Caneta c2 = new Caneta();
        c2.carga = 1;
        c2.cor = "Preto";
        c2.modelo = "Hostnet";
        c2.ponta = 0.5;
        c2.destampar();
        c2.status();
        c2.rabiscar();
    }
}
