public class Pessoa {

    //Atributos da classe pessoa
    private String nome;
    private String endereco;
    private int id;

    //Construtor com parâmetros
    public Pessoa(String nome, String endereco, int id) {
        this.nome = nome;
        this.endereco = endereco;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        if (id >= 0) {
            this.id = id;
        } else {
            System.out.println("ID inválido");
        }
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome = " + nome + ", endereco = " + endereco + ", id = " + id + '}';
    }
}
