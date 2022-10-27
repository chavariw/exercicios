package fundamentos.exercicios;

import java.util.Scanner;

public class FahrenheitxCelcius {

    public static void main(String[] args) {
        //(ºF - 32) x 5/9 = ºC
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe uma temperatura em Celsius: ");
        double tempF = entrada.nextDouble();

        final int AJUSTE = 32;
        final double FATOR = 5/9.0;
        double tempC = (tempF - AJUSTE) * FATOR;

        entrada.close();
        System.out.printf("A temperatura %.2f ºF equivale à %.2f ºC.",tempF,tempC);
    }

}
