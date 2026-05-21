public class EspecieArvore {

    private final String nome;
    private final String corFolha;
    private final String texturaTronco;

    public EspecieArvore(String nome, String corFolha, String texturaTronco) {
        this.nome = nome;
        this.corFolha = corFolha;
        this.texturaTronco = texturaTronco;
    }

    public String getNome() {
        return nome;
    }

    public void desenhar(int x, int y, double altura, double diametro, int numeroGalhos) {
        System.out.println(
            "Árvore " + nome +
            " em (" + x + ", " + y + ")" +
            " | altura: " + altura +
            " | diâmetro: " + diametro +
            " | galhos: " + numeroGalhos
        );
    }
}
