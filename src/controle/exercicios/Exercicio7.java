package controle.exercicios;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int soma = 0;
        int numero = 0;

        do {
            System.out.print("Digite um número: ");
            numero = entrada.nextInt();

            if (numero >= 0) {
                soma += numero;
                System.out.printf("A soma dos números digitados é %d\n",soma);
            }
        } while (numero >= 0);

        System.out.printf("Encerrado, a soma dos números digitados foi de %d\n",soma);
        entrada.close();
    }
}
