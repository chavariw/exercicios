package controle.exercicios;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int tentativas = 0;
        int valor = 0;
        int random_num = (int) Math.floor(Math.random()*(100-50+1)+50);

        for (int i = 10; i > 0; i--) {
            System.out.printf("Você tem %d tentativas para acertar \n um número entre 0 e 100: ", i);
            valor = entrada.nextInt();

            tentativas++;
            if (valor == random_num) {
                System.out.printf("Parabéns, você acertou em %d tentativas!",tentativas);
                break;
            }
        }

        if (tentativas >= 10) {
            System.out.println("\nQue pena, você esgotou suas tentativas!");
        }

        entrada.close();
    }
}
