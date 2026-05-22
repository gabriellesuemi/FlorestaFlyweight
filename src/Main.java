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

        // Estimativa de memória 
        int bytesSemFlyweightPorArvore = 120;

        long memoriaSemFlyweight = (long) quantidadeArvores * bytesSemFlyweightPorArvore;

        int bytesArvoreLeve = 18;
        int bytesEspecie = 200;

        long memoriaComFlyweight = ((long) quantidadeArvores * bytesArvoreLeve) + ((long) quantidadeEspecies * bytesEspecie);

        double mbCom = memoriaComFlyweight / 1000000.0;
        double mbSem = memoriaSemFlyweight / 1000000.0;

        System.out.println("\n===== MEMÓRIA =====");
        System.out.printf("Memória com Flyweight: %.2f MB%n",mbCom);
        System.out.printf("Memória sem Flyweight: %.2f MB%n", mbSem);
        System.out.printf("Economia: %.2f MB%n",(mbSem - mbCom));
    }
}