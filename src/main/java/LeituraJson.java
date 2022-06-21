import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

public class LeituraJson {
    public static void main(String[] args) throws FileNotFoundException {
Gson gson = new Gson();
Reader reader;
        Map<String, String> dadosTesteMap = new HashMap<>();
        reader =  new FileReader("src/main/resources/MassaTeste.json");
dadosTesteMap = gson.fromJson(reader,Map.class);

System.out.println(dadosTesteMap.get("nome"));
        System.out.println(dadosTesteMap.get("alunos"));
    }
}
