package fundamentos;

import java.util.Scanner;

public class DesafilCalculadora {

    public static void main(String[] args) {
        // Ler num1
        // Ler num2
        // + - * / %
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número qualquer: ");
        double num1 = entrada.nextDouble();

        System.out.print("Digite outro número qualquer: ");
        double num2 = entrada.nextDouble();

        System.out.print("Escolha uma das operações (+ - * / %): ");
        String operacao = entrada.next();

        double resultado = "+".equals(operacao) ? num1 + num2 : 0;
        resultado = "-".equals(operacao) ? num1 - num2 : resultado;
        resultado = "*".equals(operacao) ? num1 * num2 : resultado;
        resultado = "/".equals(operacao) ? num1 / num2 : resultado;
        resultado = "%".equals(operacao) ? num1 % num2 : resultado;

        System.out.printf("\n%.2f %s %.2f = %.2f",num1,operacao,num2,resultado);

        entrada.close();
    }
}
