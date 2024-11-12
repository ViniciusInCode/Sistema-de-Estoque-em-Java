// Estoque.java
// Interface Estoque representa as operações básicas de um sistema de gerenciamento de estoque.
public interface Estoque {

    // Cria um novo produto no estoque.
    // @param produto O produto a ser adicionado ao estoque.
    void criar(Produto produto);

    // Pesquisa um produto no estoque pelo seu ID.
    // @param id O ID do produto a ser pesquisado.
    // @return O produto encontrado, ou null se não for encontrado.
    Produto pesquisar(int id);

    // Altera as informações de um produto no estoque.
    // @param id O ID do produto a ser alterado.
    // @param produto O produto com as novas informações.
    void alterar(int id, Produto produto);

    // Exclui um produto do estoque pelo seu ID.
    // @param id O ID do produto a ser excluído.
    void excluir(int id);

    // Gera um relatório dos produtos no estoque.
    void relatorio();
}
