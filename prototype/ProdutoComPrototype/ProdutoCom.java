package ProdutoComPrototype;
import java.util.HashMap;
import java.util.Map;

class ProdutoCom implements Cloneable {
    private String nome;
    private double preco;
    private String categoria;
    private Map<String, String> atributos; 

    public ProdutoCom(String nome, double preco, String categoria) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
        this.atributos = new HashMap<>();
    }

    public void addAtributo(String chave, String valor) {
        atributos.put(chave, valor);
    }

    @Override
    public ProdutoCom clone() {
        try {
            ProdutoCom clone = (ProdutoCom) super.clone();
            clone.atributos = new HashMap<>(this.atributos);
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("erro ao clonar o produto", e);
        }
    }

    public void exibir() {
        System.out.println("Produto: " + nome + ", Preco: " + preco + ", Categoria: " + categoria + ", Atributos: " + atributos);
    }
}
