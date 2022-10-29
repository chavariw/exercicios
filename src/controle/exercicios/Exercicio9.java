package controle.exercicios;

import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int maior = 0;
        int numero = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.printf("informe o %dº número: ",i);
            numero = entrada.nextInt();

            if (numero > maior) {
                maior = numero;
            }
        }

        System.out.printf("O maior número digitado foi %d",maior);
        entrada.close();
    }
}
