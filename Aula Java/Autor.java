public class Autor extends Pessoa {

    public String nacionalidade;


    public Autor(String nome, String nacionalidade) {
        super(nome);
        this.nacionalidade = nacionalidade;

    }


    public String getNacionalidade() {
        return nacionalidade;
    }


    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;

    }




}
