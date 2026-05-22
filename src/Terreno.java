import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Terreno{

    private final List<Arvore> arvores = new ArrayList<>();
    private final Random random = new Random();

    public void plantarArvore(int x, int y, double altura, double diametro, int numeroGalhos, String nomeEspecie){
        EspecieArvore especie = FabricaEspecies.getEspecie(
            nomeEspecie,
            "Verde",
            "Casca comum"
        );

        Arvore arvore = new Arvore(x, y, altura, diametro, numeroGalhos, especie);
        arvores.add(arvore);
    }

    public void gerarFloresta(int quantidadeArvores, int quantidadeEspecies){
        for (int i = 0; i < quantidadeArvores; i++){
            int x = random.nextInt(1000);
            int y = random.nextInt(1000);

            double altura = 2 + random.nextDouble() * 18;
            double diametro = 0.2 + random.nextDouble() * 1.5;
            int numeroGalhos = 5 + random.nextInt(50);

            String nomeEspecie = "Espécie " + (random.nextInt(quantidadeEspecies) + 1);

            plantarArvore(x, y, altura, diametro, numeroGalhos, nomeEspecie);
        }
    }

    public int getTotalArvores(){
        return arvores.size();
    }

    public void desenharAlgumasArvores(int quantidade){
        for (int i = 0; i < quantidade && i < arvores.size(); i++){
            arvores.get(i).desenhar();
        }
    }
}