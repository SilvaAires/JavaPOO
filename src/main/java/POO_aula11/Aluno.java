package POO_aula11;

public class Aluno extends Pessoa {
    private int matricula;
    private String curso;
    
    public void pegarMensalidade(){
        System.out.println("Pagando"+this.getNome());
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
}
