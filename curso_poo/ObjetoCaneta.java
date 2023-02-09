package curso_poo;

public class ObjetoCaneta {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.modelo = "Bic";
        c1.tampada = true;
        c1.status();
        c1.rabiscar();
        System.out.println("----------------");
        Caneta c2 = new Caneta();
        c2.cor = "Preto";
        c2.modelo = "Hostnet";
        c2.destampar();
        c2.status();
        c2.rabiscar();
    }
}
