class Ferramenta extends Produto {
    private String tipo;

    public Ferramenta(int id, String nome, double preco, String tipo) {
        super(id, nome, preco);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Ferramenta [ID=" + getId() + ", Nome=" + getNome() + ", Preço=" + getPreco() + ", Tipo=" + tipo + "]";
    }
}
