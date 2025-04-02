package ProdutoSem;

import java.util.Map;

class ProdutoSem {
    private String nome;
    private double preco;
    private String categoria;
    private Map<String, String> atributos;

    public ProdutoSem(String nome, double preco, String categoria, Map<String, String> atributos) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
        this.atributos = atributos;
    }

    public void exibir() {
        System.out.println("Produto: " + nome + ", Preco: " + preco + ", Categoria: " + categoria + ", Atributos: " + atributos);
    }
}
