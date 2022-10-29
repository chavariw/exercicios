package controle.exercicios;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a primeira nota: ");
        int nota1 = entrada.nextInt();

        System.out.print("Informe a segunda nota: ");
        int nota2 = entrada.nextInt();

        double media = (nota1 + nota2) / 2.0;

        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media >= 4) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }


        entrada.close();
    }
}
