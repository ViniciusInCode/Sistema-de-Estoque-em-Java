// Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Estoque estoque = new EstoqueImpl();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Criar Produto");
            System.out.println("2. Pesquisar Produto");
            System.out.println("3. Alterar Produto");
            System.out.println("4. Excluir Produto");
            System.out.println("5. Gerar Relatório");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");

            int escolha = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer do scanner

            if (escolha == 1) {
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

                Produto produto = new Ferramenta(id, nome, preco, tipo);
                estoque.criar(produto);

            } else if (escolha == 2) {
                System.out.print("ID do Produto para pesquisa: ");
                int id = scanner.nextInt();
                Produto produto = estoque.pesquisar(id);
                System.out.println("Produto encontrado: " + produto);

            } else if (escolha == 3) {
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

                Produto produtoAlterado = new Ferramenta(id, nome, preco, tipo);
                estoque.alterar(id, produtoAlterado);

            } else if (escolha == 4) {
                System.out.print("ID do Produto a ser excluído: ");
                int id = scanner.nextInt();
                estoque.excluir(id);

            } else if (escolha == 5) {
                estoque.relatorio();

            } else if (escolha == 6) {
                System.out.println("Saindo...");
                break;

            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
