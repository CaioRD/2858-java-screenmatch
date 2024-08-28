public class Condicional {
    public static void main(String[] args) {
        int anoLancamento = 2020;
        boolean incluidoNoPlano = true;
        double nota = 8.1;
        String tipoPlano = "plus";


        if(anoLancamento >= 2022){
            System.out.println("Lançamentos que a galera anda curtindo! ");
        }else{
            System.out.println("Filme retrô que vale a pena assistir! ");
        }

        if(incluidoNoPlano == true && tipoPlano.equals("plus")){
            System.out.println("Filme liberado");
        }else{
            System.out.println("filme não incluido no plano");
        }

    }
}
