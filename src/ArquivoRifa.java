import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ArquivoRifa {

    private Map<Integer, String> participantes = new HashMap<>();

    public void carregar(File file) throws IOException {
        try (BufferedReader ler = new BufferedReader(new FileReader(file))) {
            for (String linha = ler.readLine(); linha != null; linha = ler.readLine()) {
                String[] dados = linha.split(",");

                String numero = dados[0];
                String nomeParticipante =  dados[1];
                if (numero != "" && nomeParticipante != "") {
                    participantes.put(Integer.parseInt(numero), nomeParticipante);
                }
            }
        }
    }

    public String sortear() {
        int max = 500;
        int min = 1;
        int range = max - min + 1;

        int numeroSorteado = (int) (Math.random() * range + min);

        while(participantes.get(numeroSorteado) == null) {
            numeroSorteado = (int) (Math.random() * range + min);
        }

        return "Vencedor: " + participantes.get(numeroSorteado) + "- Número: " + numeroSorteado;
    }

    public void getLista() {
        System.out.println("------------------------------------------------------");
        System.out.println("===================Participantes=========================");

        for (Integer numero : participantes.keySet()) {
            System.out.println(numero + " = " + participantes.get(numero));
        }
        System.out.println("------------------------------------------------------");
    }


}
