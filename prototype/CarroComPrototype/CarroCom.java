package CarroComPrototype;
import java.util.HashMap;
import java.util.Map;

class CarroCom implements Cloneable {
    private String modelo;
    private double preco;
    private String marca;
    private Map<String, String> especificacoes;

    public CarroCom(String modelo, double preco, String marca) {
        this.modelo = modelo;
        this.preco = preco;
        this.marca = marca;
        this.especificacoes = new HashMap<>();
    }

    public void addEspecificacao(String chave, String valor) {
        especificacoes.put(chave, valor);
    }

    @Override
    public CarroCom clone() {
        try {
            CarroCom clone = (CarroCom) super.clone();
            clone.especificacoes = new HashMap<>(this.especificacoes);
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("erro ao clonar o carro", e);
        }
    }

    public void exibir() {
        System.out.println("Carro: " + modelo + ", Preco: " + preco + ", Marca: " + marca + ", Especificacoes: " + especificacoes);
    }
}
