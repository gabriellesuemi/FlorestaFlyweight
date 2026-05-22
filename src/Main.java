public class Main {

    public static void main(String[] args){

        int quantidadeArvores = 10000;
        int quantidadeEspecies = 50;

        Terreno terreno = new Terreno();

        terreno.gerarFloresta(quantidadeArvores, quantidadeEspecies);

        System.out.println("===== SIMULAÇÃO COM FLYWEIGHT =====");
        System.out.println("Total de árvores no terreno: " + terreno.getTotalArvores());
        System.out.println("Total de espécies diferentes: " + quantidadeEspecies);
        System.out.println("Objetos de espécie criados: " + FabricaEspecies.getTotalEspeciesCriadas());
        System.out.println("Objetos árvore criados: " + terreno.getTotalArvores());


    }
}