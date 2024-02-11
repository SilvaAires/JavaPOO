package POO_Aula02;

public class projetoLIvro {
    public static void main (String [] args){
        Pessoa [] p = new Pessoa[3];
        Livro [] l = new Livro[3];
        
        p[0] = new Pessoa("Pedro", 22, 'M');
        p[1] = new Pessoa("Maria", 25,'F');
        
        l[0] = new Livro ("Aprendendo java", "José da silva", 300, p[0]);
        l[1] = new Livro ("POO para Iniciante", "Pedro paulo", 500, p[1]);
        l[2] = new Livro ("Java Avançado", "Maria Candida", 800, p[0]);
        
        l[0].abrir();
        l[0].folhear(200);
        
        System.out.println(l[0].detalhes());
        
        System.out.println(l[1].detalhes());
    }
}
