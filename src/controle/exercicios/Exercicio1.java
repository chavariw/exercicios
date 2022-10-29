package controle.exercicios;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("informe um número: ");
        int valor = entrada.nextInt();

        if (valor >= 0 && valor <= 10) {
            System.out.println("O valor está entre 0 e 10.");
        } else {
            System.out.println("O valor NÃO está entre 0 e 10.");
        }

        if (valor % 2 == 0) {
            System.out.println("O valor é par");
        } else {
            System.out.println("O valor NÃO é par");
        }

        entrada.close();
    }
}
