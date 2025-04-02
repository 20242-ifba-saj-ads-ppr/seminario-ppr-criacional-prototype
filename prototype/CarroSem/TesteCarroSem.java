package CarroSem;

import java.util.Map;

class TesteCarroSem {
    private String modelo;
    private double preco;
    private String marca;
    private Map<String, String> especificacoes;

    public TesteCarroSem(String modelo, double preco, String marca, Map<String, String> especificacoes) {
        this.modelo = modelo;
        this.preco = preco;
        this.marca = marca;
        this.especificacoes = especificacoes;
    }

    public void exibir() {
        System.out.println("Carro: " + modelo + ", Preco: " + preco + ", Marca: " + marca + ", Especificacoes: " + especificacoes);
    }
}

