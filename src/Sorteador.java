import java.io.File;
import java.io.IOException;

public class Sorteador {
    public static void main(String[] args) throws IOException {

        ArquivoRifa arquivoRifa = new ArquivoRifa();

        arquivoRifa.carregar(new File("C:\\Users\\yasmi\\IdeaProjects\\SorteadorRifaAlemao\\src\\participantesRifa.csv"));

        System.out.println();
        arquivoRifa.getLista();

        System.out.println("----------------------------------------------------------");
        System.out.println("Primeiro sorteio (Quadro Ovelhas no pasto)");
        System.out.println(arquivoRifa.sortear());

        System.out.println("----------------------------------------------------------");
        System.out.println("Segundo sorteio (Quadro Chimarrão)");
        System.out.println(arquivoRifa.sortear());

        System.out.println("----------------------------------------------------------");
        System.out.println("Terceiro sorteio (Cesta de Natal)");
        System.out.println(arquivoRifa.sortear());


    }
}
