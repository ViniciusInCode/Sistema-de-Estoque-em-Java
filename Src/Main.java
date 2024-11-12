// Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Cria uma instância de Estoque
        Estoque estoque = new EstoqueImpl();
        // Cria um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Loop infinito para exibir o menu e processar as opções do usuário
        while (true) {
            // Exibe o menu
            System.out.println("\n--- Menu ---");
            System.out.println("1. Criar Produto");
            System.out.println("2. Pesquisar Produto");
            System.out.println("3. Alterar Produto");
            System.out.println("4. Excluir Produto");
            System.out.println("5. Gerar Relatório");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");

            // Lê a escolha do usuário
            int escolha = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer do scanner

            // Processa a escolha do usuário
            if (escolha == 1) {
                // Criação de um novo produto
                System.out.print("ID do Produto: ");
                int id = scanner.nextInt();
                scanner.nextLine(); // Limpar buffer do scanner
                System.out.print("Nome do Produto: ");
                String nome = scanner.nextLine();
                System.out.print("Preço do Produto: ");
                double preco = scanner.nextDouble();
                scanner.nextLine(); // Limpar buffer do scanner
                System.out.print("Tipo de Ferramenta: ");
                String tipo = scanner.nextLine();

                // Cria um novo produto e adiciona ao estoque
                Produto produto = new Ferramenta(id, nome, preco, tipo);
                estoque.criar(produto);

            } else if (escolha == 2) {
                // Pesquisa de um produto pelo ID
                System.out.print("ID do Produto para pesquisa: ");
                int id = scanner.nextInt();
                Produto produto = estoque.pesquisar(id);
                System.out.println("Produto encontrado: " + produto);

            } else if (escolha == 3) {
                // Alteração de um produto existente
                System.out.print("ID do Produto a ser alterado: ");
                int id = scanner.nextInt();
                scanner.nextLine(); // Limpar buffer do scanner
                System.out.print("Novo Nome do Produto: ");
                String nome = scanner.nextLine();
                System.out.print("Novo Preço do Produto: ");
                double preco = scanner.nextDouble();
                scanner.nextLine(); // Limpar buffer do scanner
                System.out.print("Novo Tipo de Ferramenta: ");
                String tipo = scanner.nextLine();

                // Cria um novo produto com as informações alteradas e atualiza no estoque
                Produto produtoAlterado = new Ferramenta(id, nome, preco, tipo);
                estoque.alterar(id, produtoAlterado);

            } else if (escolha == 4) {
                // Exclusão de um produto pelo ID
                System.out.print("ID do Produto a ser excluído: ");
                int id = scanner.nextInt();
                estoque.excluir(id);

            } else if (escolha == 5) {
                // Geração de relatório de produtos
                estoque.relatorio();

            } else if (escolha == 6) {
                // Saída do programa
                System.out.println("Saindo...");
                break;

            } else {
                // Opção inválida
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        // Fecha o scanner
        scanner.close();
    }
}
