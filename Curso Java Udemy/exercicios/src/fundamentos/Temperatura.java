package fundamentos;

public class Temperatura {
    public static void main(String[] args) {
        // formula = (°F - 32) * 5/9 = °C

        final double AJUSTE = 32; //Por convenção os nomes de constantes são em maiusculo
        final double FATOR = 5.0 / 9.0;

        double fahrenheit = 86;
        double celsius = (fahrenheit - AJUSTE) * FATOR;
        System.out.println("O resultado é " + celsius + "C");

        fahrenheit = 0;
        celsius = (fahrenheit - AJUSTE) * FATOR;
        System.out.println("O resultado é " + celsius + "C");
    }
}
