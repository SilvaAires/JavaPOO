package POO_Aula02;

import java.util.Scanner;

public class Caneta {
    private float pp = ponta();
    public String modelo;
    public String cor;
    protected int carga;
    protected boolean tampada;
    
    public void status(){
        System.out.println("Cor da caneta: " + this.cor);
        System.out.println("Esta tampada: " +this.tampada);
        System.out.println("Modelo da caneta: " +this.modelo);
        System.out.println("Ponta da caneta: " +this.pp);
        System.out.println("Carga da caneta: " +this.carga);

    }
    
    public void rabiscar(){
        if (this.tampada == true){
            System.out.println("Erro: Nao posso rabiscar");
        }else{
            System.out.println("Estou rabiscando");
        }
    }
    
    static float ponta(){
        Scanner e = new Scanner(System.in);
        System.out.println("Qual o é o numero da ponta? ");
        float p = e.nextFloat();
        return p;
    }
    
    protected void tampar(){
        this.tampada = true;   
    }
    
    protected void destampar(){
        this.tampada = false;
    }
    
}
