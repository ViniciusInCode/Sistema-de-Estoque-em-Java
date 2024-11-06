public class Main {
    public static void main(String[] args) {
        Estoque estoque = new EstoqueImpl();

        // Criando produtos
        Produto ferramenta1 = new Ferramenta(1, "Martelo", 50.0, "Manual");
        Produto ferramenta2 = new Ferramenta(2, "Furadeira", 200.0, "Elétrica");

        estoque.criar(ferramenta1);
        estoque.criar(ferramenta2);

        // Relatório
        estoque.relatorio();

        // Pesquisar produto
        Produto produtoPesquisado = estoque.pesquisar(1);
        System.out.println("Produto pesquisado: " + produtoPesquisado);

        // Alterar produto
        Produto ferramentaAlterada = new Ferramenta(1, "Martelo", 55.0, "Manual");
        estoque.alterar(1, ferramentaAlterada);

        // Excluir produto
        estoque.excluir(2);

        // Relatório final
        estoque.relatorio();
    }
}
