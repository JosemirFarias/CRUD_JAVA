import java.util.ArrayList;
import java.util.List;

public class PessoaService {
    private final List<Pessoa> pessoas = new ArrayList<>();

    // Adiciona pessoas
    public void adicionaPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    //Lista a quantidade de pessoas cadastradas
    public List<Pessoa>listarPessoas() {
        return pessoas;
    }

    //Busca pessoas pelo ID
    public Pessoa buscaPessoaPorId(int id) {
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getId() == id) {
                return pessoa;
            }
        }
        return null;
    }

    //Atualiza os dados cadastrados
    public boolean atualizaPessoa(int id, String novoEndereco) {
        Pessoa pessoa = buscaPessoaPorId(id);
        if (pessoa != null) {
            pessoa.setEndereco(novoEndereco);
            return true;
        }
        return false;
    }

    //Faz a busca pelo id e deleta os dados
    public boolean deletaPessoa(int id) {
        Pessoa pessoa = buscaPessoaPorId(id);
        if (pessoa != null) {
            pessoas.remove(pessoa);
            return true;
        }
        return false;
    }
}
