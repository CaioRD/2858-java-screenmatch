import java.util.Scanner;

public class LacoWhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double nota = 0;
        double avaliacaoMedia = 0;
        int acumulaMedia = 0;

        while (nota != -1) {
            System.out.println("Digite uma nota para o filme ou -1 para encerrar: ");
            nota = s.nextDouble();

            if(nota != -1){
                avaliacaoMedia += nota;
                acumulaMedia++;
            }


        }
        System.out.println("A média de nota desse filme foi: " + avaliacaoMedia / acumulaMedia);
    }
}
