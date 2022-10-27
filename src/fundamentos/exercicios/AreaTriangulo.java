package fundamentos.exercicios;

import java.util.Scanner;

public class AreaTriangulo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o valor da base do triângulo: ");
        double base = entrada.nextDouble();

        System.out.print("Informe o valor da altura do triângulo: ");
        double altura = entrada.nextDouble();

        double area = (base * altura) / 2;

        System.out.printf("O triângulo de base %.2f e altura %.2f, tem área igual à %.2f",base,altura,area);


        entrada.close();
    }
}
