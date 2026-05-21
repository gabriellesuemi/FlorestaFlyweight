import java.util.HashMap;
import java.util.Map;

public class FabricaEspecies{

    private static final Map<String, EspecieArvore> especies = new HashMap<>();

    public static EspecieArvore getEspecie(String nome, String corFolha, String texturaTronco){
        if (!especies.containsKey(nome)){
            especies.put(nome, new EspecieArvore(nome, corFolha, texturaTronco));
        }

        return especies.get(nome);
    }

    public static int getTotalEspeciesCriadas(){
        return especies.size();
    }
}