import java.util.Scanner;

public class LacoRepeticao {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
        double nota = 0;
        double avaliacaoMedia = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite uma nota para o filme: ");
            nota = s.nextDouble();
            avaliacaoMedia += nota;

        }
        System.out.println("A média de nota desse filme foi: " + avaliacaoMedia / 3);
    }
}
