package controle.exercicios;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int valor = entrada.nextInt();;
        int resultado = 0;

        for (int i = 2; i < valor / 2; i++) {
            if (valor % i == 0) {
                resultado++;
                break;
            }
        }

        switch (resultado) {
            case 0:
                System.out.printf("%d é número primo",valor);
                break;
            default:
                System.out.printf("%d NÃO é número primo",valor);
        }

        entrada.close();
    }
}
