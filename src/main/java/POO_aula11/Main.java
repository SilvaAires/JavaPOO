package POO_aula11;

public class Main {
    public static void main(String [] args){
        Visitante v = new Visitante();
        v.setNome("Juvenal");
        v.setIdade(22);
        v.setSexo("M");
        System.out.println(v.toString());
        
        Aluno a = new Aluno(); 
        a.setNome("Claudio");
        a.setMatricula(2001);
        a.setCurso("TI");
        a.setIdade(16);
        a.setSexo("M");
        a.pegarMensalidade();
        
        Bolsista b = new Bolsista();
        b.setMatricula(112);
        b.setNome("Jubileu");
        b.setBolsa(12.3f);
        b.setSexo("M");
        b.pegarMensalidade();
    }
}
