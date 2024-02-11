package POO_Aula02;

public class Aula_07_Lutador {
    public static void main (String [] args){
        Lutador l [] = new Lutador [6];
        l[0] = new Lutador ("Thiago", "Brasileiro", 22, 1.90, 115.20, 5, 2, 3);
        l[1] = new Lutador ("Ryan", "Brasileiro", 23, 1.70, 110.20, 1, 1, 1);
        //[0].apresentar();
        
        Luta tf1 = new Luta();
        tf1.marcarLuta(l[0], l[1]);
        tf1.lutar();
        
        l[0].status();
        l[1].status();
    }
}
