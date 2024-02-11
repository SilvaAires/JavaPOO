package POO_aula11;

public class Bolsista extends Aluno {
    private float bolsa;
    
    public void reBolsa(){
        System.out.println("Renovando bolsa de "+this.getNome());
    }
    
    @Override
    public void pegarMensalidade(){
        System.out.println(this.getNome()+"é bolsista, pagamento");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
}
