package fundamentos.exercicios;

import java.util.Scanner;

public class CelciusxFahrenheit {

    public static void main(String[] args) {
        //(0 °C × 9 / 5) + 32 = 32 °F
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a temperatura em Fahrenheit: ");
        double tempF = entrada.nextDouble();

        final int AJUSTE = 32;
        final double FATOR = 5/9.0;
        double tempC = (tempF * FATOR) + AJUSTE;

        entrada.close();
        System.out.printf("A temperatura %.2f ºF equivale à %.2f ºF.",tempF,tempC);

    }
}
