import java.util.ArrayList;
import java.util.List;

class EstoqueImpl implements Estoque {
    private List<Produto> produtos = new ArrayList<>();

    @Override
    public void criar(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto criado: " + produto);
    }

    @Override
    public Produto pesquisar(int id) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null;
    }

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

    @Override
    public void excluir(int id) {
        produtos.removeIf(produto -> produto.getId() == id);
        System.out.println("Produto com ID " + id + " excluído.");
    }

    @Override
    public void relatorio() {
        System.out.println("Relatório de Produtos:");
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }
}
