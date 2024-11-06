interface Estoque {
    void criar(Produto produto);
    Produto pesquisar(int id);
    void alterar(int id, Produto produto);
    void excluir(int id);
    void relatorio();
}
