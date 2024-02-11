package POO_Aula10;

public class Aluno extends Pessoa {
    private int mat;
    private String curso;

    public Aluno(int mat, String curso) {
        this.mat = mat;
        this.curso = curso;
    }

    public Aluno() {
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public void cancelarMart(){
        System.out.println("Matrícula será cancelada");
    }
}
