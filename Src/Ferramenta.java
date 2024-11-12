// Ferramenta.java
public class Ferramenta extends Produto {
    // Atributo que define o tipo da ferramenta
    private String tipo;

    // Construtor da classe Ferramenta
    public Ferramenta(int id, String nome, double preco, String tipo) {
        super(id, nome, preco); // Chama o construtor da classe pai Produto
        this.tipo = tipo; // Inicializa o atributo tipo
    }

    // Método getter para o atributo tipo
    public String getTipo() {
        return tipo;
    }

    // Método toString para representar a Ferramenta como uma string
    @Override
    public String toString() {
        return "Ferramenta [ID=" + getId() + ", Nome=" + getNome() + ", Preço=" + getPreco() + ", Tipo=" + tipo + "]";
    }
}
