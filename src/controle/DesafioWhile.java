package controle;

import java.util.Scanner;

public class DesafioWhile {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double nota = 0;
        double soma = 0;
        double qtd = 0;

        while (nota != -1) {
            System.out.print("Digite uma nota: ");
            nota = entrada.nextDouble();

            if (nota <= 10 || nota >= 0) {
                soma += nota;
                qtd++;
            } else if (nota != -1) {
                System.out.println("Digite uma nota válida");
            }

        }

        double media = soma / qtd;
        System.out.printf("A média calculada foi %.2f",media);

        entrada.close();
    }
}
