package POO_Aula02;

public class Aula02_03 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.ponta();
        c1.cor = "Azul";
        c1.tampada = false;
        c1.carga = 90;
        c1.modelo = "BIC";
        c1.status();
        c1.destampar();
        c1.rabiscar();
        
        System.out.println("\n");
        
        Caneta c2 = new Caneta();
        c2.ponta();
        c2.cor = "Preta";
        c2.tampada = true;
        c2.carga = 40;
        c2.modelo = "Fabre";
        c2.status();
        c2.tampar();
        c2.rabiscar();
    }
}
