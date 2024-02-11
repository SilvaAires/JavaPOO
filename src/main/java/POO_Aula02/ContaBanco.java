package POO_Aula02;

public class ContaBanco {
    public int numConta;
    protected String tipoConta;
    private  String dono;
    private float saldo;
    private boolean status;
    
    public void estadoAtual(){
        System.out.println("Conta: "+this.getNumConta());
        System.out.println("Tipo: "+this.getTipo());
        System.out.println("Dono: "+this.getDono());
        System.out.println("Saldo: "+this.getSaldo());
        System.out.println("Status: "+this.getStatus());
    }
    
    public void abrirConta(String US){
        this.setTipo(US);
        this.setStatus(true);
        if ("CC".equals(US)){
            this.setSaldo(50);
        }else { if ("CP".equals(US)){
            this.setSaldo(150);
        }
        }
        System.out.println("Conta aberta.");
    }
    
    public void fechaConta(){
        if ( this.getSaldo() > 0){
            System.out.println("Conta tem  dinheiro");
        }
        else {
            if (this.getSaldo() < 0 ){
                System.out.println("Conta em debito");
            }
            else{
                this.setStatus(false);
                System.out.println("Conta fechada");
            }
        } 
    }
    
    public void depositar(float v){
        if (this.getStatus() == true){
            this.setSaldo(this.getSaldo()+v);
            System.out.println("Deposito realizado na conta de "+this.getDono());
        }else{
            System.out.println("Impossível depositar, conta fechada.");
        }
    }
    
    public void sacar(float v){
        if (this.getStatus()){
            if ( this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            }else{
                System.out.println("Saldo insuficiente");
            }
        }else{
            System.out.println("Impossivel sacar, status da conta: "+ this.getStatus());
        }
    }
    
    public void pagarMensal(){
        float v = 0;
        if ("CC".equals(this.getTipo())){
            v = 12;
        }else{
            if ("CP".equals(this.getTipo())){
                v = 20;
            }
        }
        if (this.getStatus()==true){
            if (this.getSaldo() > v){
                this.setSaldo(this.getSaldo()-v);
            }else{
                System.out.println("Saldo inssuficiente");
            }
        }else{
            System.out.println("Impossivvel pagar");
        }
    }
    
    public ContaBanco(){
        this.setSaldo(0);
        this.setStatus(false);
    }
    
    public void setNumConta( int n){
        this.numConta = n;
    }

    public int getNumConta(){
        return this.numConta;
    }
    
    public void setTipo(String t){
        this.tipoConta = t;
    }
    
    public String getTipo(){
        return this.tipoConta;
    }
    
    public void setDono(String d){
        this.dono = d;
    }
    
    public String getDono(){
        return this.dono;
    }
    
    public void setSaldo(float s){
        this.saldo = s;
    }
    
    public float getSaldo(){
        return this.saldo;
    }
    
    public void setStatus(boolean S){
        this.status = S;
    }
    
    public boolean getStatus(){
        return this.status;
    }
}
