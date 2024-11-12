// Produto.java
public class Produto {
    // Atributos da classe Produto
    private int id;
    private String nome;
    private double preco;

    // Construtor da classe Produto
    public Produto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    // Método para obter o ID do produto
    public int getId() {
        return id;
    }

    // Método para obter o nome do produto
    public String getNome() {
        return nome;
    }

    // Método para obter o preço do produto
    public double getPreco() {
        return preco;
    }

    // Método para retornar uma representação em string do produto
    @Override
    public String toString() {
        return "Produto [ID=" + id + ", Nome=" + nome + ", Preço=" + preco + "]";
    }
}
