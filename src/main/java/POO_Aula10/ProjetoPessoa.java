package POO_Aula10;

public class ProjetoPessoa {
    public static void main(String []args){
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Pedro");
        p1.setSexo('M');

        p2.setNome("Maria");
        p2.setIdade(42);
        p2.setCurso("Informática");
        
        p3.setNome("Claudio");
        p3.setSalario(2500.75f);
        
        p4.setNome("Fabiana");
        p4.setSexo('F');
        p4.setSetor("Estoque");
        
        System.out.println("\n"+p1.toString());
        System.out.println("\n"+p2.toString());
        System.out.println("\n"+p3.toString());
        System.out.println("\n"+p4.toString());
    }
}
