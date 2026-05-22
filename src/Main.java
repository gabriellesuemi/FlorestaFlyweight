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

        int objetosComFlyweight = terreno.getTotalArvores() + FabricaEspecies.getTotalEspeciesCriadas();
        int objetosSemFlyweight = terreno.getTotalArvores() * 2;

        System.out.println();
        System.out.println("Objetos com Flyweight: " + objetosComFlyweight);
        System.out.println("Objetos sem Flyweight: " + objetosSemFlyweight);

        System.out.println();
        System.out.println("Exemplo de algumas árvores:");
        terreno.desenharAlgumasArvores(5);
    }
}