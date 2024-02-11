package POO_Aula02;

public class Aula_05_ContaBanco {
    public static void main(String[]args){
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Thiago");
        p1.abrirConta("CC");
        p1.depositar(300);
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono("Creuza");
        p2.abrirConta("CP");
        p2.depositar(500);
        p2.sacar(100);
        
        p1.sacar(150);
        p1.fechaConta();
        
        p1.estadoAtual();
        System.out.println("\n");
        p2.estadoAtual();
    }
}
