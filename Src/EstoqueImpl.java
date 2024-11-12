// EstoqueImpl.java
import java.util.ArrayList;
import java.util.List;

// Implementação da interface Estoque para gerenciar uma lista de produtos.
public class EstoqueImpl implements Estoque {
    
    // Lista de produtos no estoque.
    private List<Produto> produtos = new ArrayList<>();

    // Adiciona um novo produto ao estoque.
    @Override
    public void criar(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto criado: " + produto);
    }

    // Pesquisa um produto no estoque pelo seu ID.
    @Override
    public Produto pesquisar(int id) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        System.out.println("Produto não encontrado.");
        return null;
    }

    // Altera um produto no estoque pelo seu ID.
    @Override
    public void alterar(int id, Produto produtoAlterado) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getId() == id) {
                produtos.set(i, produtoAlterado);
                System.out.println("Produto alterado: " + produtoAlterado);
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }

    // Exclui um produto do estoque pelo seu ID.
    @Override
    public void excluir(int id) {
        produtos.removeIf(produto -> produto.getId() == id);
        System.out.println("Produto com ID " + id + " excluído.");
    }

    // Gera um relatório de todos os produtos no estoque.
    @Override
    public void relatorio() {
        System.out.println("Relatório de Produtos:");
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }
}
