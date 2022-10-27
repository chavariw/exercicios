package fundamentos.exercicios;

import java.util.Scanner;

public class QuadradoCubo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe um número qualquer ");
        double num1 = entrada.nextDouble();

        double quadrado = Math.pow(num1,2);
        double cubo = Math.pow(num1,3);

        System.out.printf("O quadrado de %.2f é %.2f",num1,quadrado);
        System.out.printf("\nO cubo de %.2f é %.2f",num1,cubo);

        entrada.close();
    }
}
