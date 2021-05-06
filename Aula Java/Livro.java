public class Livro {
    String nome;
    Autor  autor;
    Pessoa EmprestadoPor;

    public Livro(String nome, Autor autor){
        this.nome = nome;
        this.autor = autor;
    }
    public String getnome(){
    return this.nome;
    }
    public void setnome(String nome){
        this.nome = nome;
    }
    public Autor getautor() {
        return this.autor;
    }
    public void setAutor (Autor autor) {
        this.autor = autor;
    }
    public Pessoa getemprestadoPor() {
        return this.EmprestadoPor;
    }
    public void setEmprestadoPor(Pessoa EmprestadoPor) {
        this.EmprestadoPor = EmprestadoPor;
    }
    public String toString() {
        return "Livro [" + nome + 
                "]\n >Autor: " + autor.nome + 
                "\n >Nacionalidade: "+ autor.nacionalidade +
                "\n >Emprestado por: " + EmprestadoPor.nome + 
                "\n";
    }
    }