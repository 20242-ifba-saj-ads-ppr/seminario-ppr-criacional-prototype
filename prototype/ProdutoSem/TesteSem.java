package ProdutoSem;

import java.util.HashMap;
import java.util.Map;

public class TesteSem {
    public static void main(String[] args) {
        Map<String, String> atributosBase = new HashMap<>();
        atributosBase.put("cor", "Azul");
        atributosBase.put("tamanho", "M");
        ProdutoSem camiseta = new ProdutoSem("Camiseta Basica", 49.90, "Roupas", atributosBase);

        Map<String, String> atributosVermelho = new HashMap<>(atributosBase);
        atributosVermelho.put("cor", "Vermelho");
        ProdutoSem camisetaVermelha = new ProdutoSem("Camiseta Bcsica", 49.90, "Roupas", atributosVermelho);

        Map<String, String> atributosGrande = new HashMap<>(atributosBase);
        atributosGrande.put("tamanho", "M");
        ProdutoSem camisetaGrande = new ProdutoSem("Camiseta Comum", 49.90, "Roupas", atributosGrande);

        camiseta.exibir();
        camisetaVermelha.exibir();
        camisetaGrande.exibir();
    }
}
