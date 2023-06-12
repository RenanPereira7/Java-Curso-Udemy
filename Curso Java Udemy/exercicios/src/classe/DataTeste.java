package classe;

public class DataTeste {
    public static void main(String[] args) {

        /*
        Data d1 = new Data();
        d1.dia = 18;
        d1.mes = "Julho";
        d1.ano = 2001;
        */

        Data d1 = new Data();
        d1.ano = 2021;

        var d2 = new Data(31, 12, 2020);
         /*
        d2.dia = 23;
        d2.mes = "Outubro";
        d2.ano = 1972;
        */

        String dataFormatada1 = d1.obterDataFormatada();

        System.out.println(dataFormatada1);
        System.out.println(d2.obterDataFormatada());

        d1.imprimirDataFormatada();
        d2.imprimirDataFormatada();

       // System.out.printf("Dia: " + d1.dia + " Mês: " + d1.mes + " Ano: " + d1.ano + "\n");
        //System.out.printf("Dia: " + d2.dia + " Mês: " + d2.mes + " Ano: " + d2.ano);





    }
}
