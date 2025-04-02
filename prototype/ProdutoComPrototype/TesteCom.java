package ProdutoComPrototype;

public class TesteCom {
    public static void main(String[] args) {
        ProdutoCom camiseta = new ProdutoCom("Camiseta Basica", 49.90, "Roupas");
        camiseta.addAtributo("cor", "Azul");
        camiseta.addAtributo("tamanho", "M");

        ProdutoCom camisetaVermelha = camiseta.clone();
        camisetaVermelha.addAtributo("cor", "Vermelho");

        ProdutoCom camisetaGrande = camiseta.clone();
        camisetaGrande.addAtributo("tamanho", "G");

        camiseta.exibir();
        camisetaVermelha.exibir();
        camisetaGrande.exibir();
    }
}
