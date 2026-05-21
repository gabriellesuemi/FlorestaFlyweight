public class Arvore {

    private final int x;
    private final int y;
    private final double altura;
    private final double diametro;
    private final int numeroGalhos;

    private final EspecieArvore especie;

    public Arvore(int x, int y, double altura, double diametro, int numeroGalhos, EspecieArvore especie) {
        this.x = x;
        this.y = y;
        this.altura = altura;
        this.diametro = diametro;
        this.numeroGalhos = numeroGalhos;
        this.especie = especie;
    }

    public void desenhar() {
        especie.desenhar(x, y, altura, diametro, numeroGalhos);
    }
}
