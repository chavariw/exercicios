package controle.exercicios;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe um ano: ");
        int ano = entrada.nextInt();

        if (((ano % 4 == 0) && (ano % 100 != 0)) || (ano % 400 == 0)) {
            System.out.printf("O ano %d é bissexto", ano);
        } else {
            System.out.printf("O ano %d NÃO é bissexto", ano);
        }

        entrada.close();;
    }
}
