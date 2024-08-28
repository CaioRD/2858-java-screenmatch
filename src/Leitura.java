import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite seu filme favorito: ");
        String filme = s.nextLine();

        System.out.println("Digite o ano do filme: ");
        int anoDofilme = s.nextInt();

    System.out.println("Digite uma nota para ele: ");
    double notaFilme = s.nextDouble();

        System.out.println("O seu filme favorito é: " + filme);
        System.out.println("O ano de lançamento foi: " + anoDofilme);
        System.out.println("A sua nota para o filme é: " + notaFilme);
    }
}
