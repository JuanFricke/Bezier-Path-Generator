import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantidade de coordenadas (pontos wp): ");
        int numCoords = Integer.parseInt(scanner.nextLine());

        String fileName = "coordenadas.txt"; // Nome padrão do arquivo

        System.out.println("Digite as coordenadas (x, y) dos pontos wp, rp e o valor gp separados por espaço:");

        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            for (int i = 0; i < numCoords; i++) {
                System.out.print("wp: ");
                String wpCoords = scanner.nextLine();

                System.out.print("rp: ");
                String rpCoords = scanner.nextLine();

                System.out.print("gp: ");
                int gp = Integer.parseInt(scanner.nextLine());

                // Escreve as coordenadas no arquivo
                writer.println("wp={" + wpCoords + "}");
                writer.println("rp={" + rpCoords + "}");
                writer.println("gp={" + gp + "}");
            }
            System.out.println("Coordenadas foram gravadas no arquivo " + fileName);
        } catch (IOException e) {
            System.out.println("Erro ao gravar as coordenadas no arquivo.");
        }
    }
}
