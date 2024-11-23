import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        PessoaService pessoaService = new PessoaService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n---Menu---");
            System.out.println("1 - Cadastrar Pessoa");
            System.out.println("2 - Listar Pessoas");
            System.out.println("3 - Atualizar Pessoa");
            System.out.println("4 - Excluir Pessoa");
            System.out.println("5 - Sair");
            System.out.println("Escolha uma opção");

            int opcao = scanner.nextInt();
            scanner.nextLine(); //Consume a quebra de linha

            switch (opcao) {

                //Adicina pessoas a lista
                case 1:
                    System.out.println("Digite o ID da pessoa: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); //Consumir a quebra de linha
                    System.out.println("Digite o nome da pessoa: ");
                    String nome = scanner.nextLine();
                    System.out.println("Digite o endereço da pessoa: ");
                    String endereco = scanner.nextLine();
                    pessoaService.adicionaPessoa(new Pessoa(nome, endereco, id));
                    System.out.println("Pessoa cadastrada com sucesso!");
                    break;

                    //Lista as pessoas já cadastradas
                case 2:
                    System.out.println("\nListar Pessoas: ");
                    for (Pessoa pessoa : pessoaService.listarPessoas()) {
                        System.out.println(pessoa);
                    }
                    break;

                    //Atualiza dados cadrastrados. Nesse caso apenas o endereço
                case 3:
                    System.out.println("\nDigite o ID da pessoa para atualizar: ");
                    int idAtualizar = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Digite o novo endereço da pessoa para atualizar: ");
                    String novoEdereco = scanner.nextLine();
                    if (pessoaService.atualizaPessoa(idAtualizar, novoEdereco)) {
                        System.out.println("Cadastro atualizado com sucesso!");
                    } else {
                        System.out.println("Pessoa não encontrada!");
                    }
                    break;

                    //Exclui dados
                case 4:
                    System.out.println("\nDigite o ID da pessoa para excluir: ");
                    int idExcluir = scanner.nextInt();
                    if (pessoaService.deletaPessoa(idExcluir)) {
                        System.out.println("Pessoa removida com sucesso!");
                    } else {
                        System.out.println("Pessoa não encontrada!");
                    }
                    break;

                case 5:
                    System.out.println("\nSair");
                    scanner.close();
                    return;

                    default:
                        System.out.println("Opção invalida! Tente novamente!");
            }
        }
    }
}