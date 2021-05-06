public class Aluno extends Pessoa {

    String codigo;
    public Aluno (String nome, String codigo){
        super(nome);
        this.codigo = codigo;
    }
    public String getCodigo(){
        return this.codigo;
    }
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

} 
