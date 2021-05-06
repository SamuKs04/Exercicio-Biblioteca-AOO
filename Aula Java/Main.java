public class Main {

    public static void main (String[] args){
        Autor autor1 = new Autor("Stephen Hawking", "Reino Unido");

        Autor autor2 = new Autor("Stephen Covey", "Estados Unidos");

        Aluno aluno = new Aluno("Samuel", "15a");
        Professor professor = new Professor("Efrain", "trec");

        

    Livro Livro1 = new Livro("Uma breve historia do tempo", autor1);
    Livro1.setEmprestadoPor(aluno);
    Livro Livro2 = new Livro("Stephen covey",autor2);
    Livro2.setEmprestadoPor(professor);

    System.out.println("Emprestado por: " + aluno.nome + "\nCódigo de acesso: " + aluno.codigo);
    System.out.println("Nacionalidade do autor: " + autor2.nacionalidade);
    System.out.println("\nNome do Livro: " + Livro2.nome + "\nNome do autor: " + autor2.nome);
    System.out.println("Emprestado por: " + professor.nome + "\nCódigo de acesso: " + professor.codigo);
    System.out.println("\nNacionalidade do autor: " + autor1.nacionalidade);
    System.out.println("Nome do livro: " + Livro1.nome + "\nNome do autor: " + autor1.nome);
    }
    
}