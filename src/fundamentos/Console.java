package fundamentos;

import java.util.Scanner;

public class Console {

    public static void main(String[] args) {

        System.out.print("Bom");
        System.out.print(" dia!\n\n");

        System.out.println("Bom");
        System.out.println("dia!");

        System.out.printf("Megasena: %d %d %d %d %d %d",
                1,2,3,4,5,6);
        System.out.printf("\nSalario: %.1f", 1234.5678);
        System.out.printf("\nNome: %s", "João");

        Scanner entrada = new Scanner(System.in);

        System.out.println("\nDigite o seu nome: ");
        String nome = entrada.nextLine();

        System.out.println("Digite o seu sobrenome: ");
        String sobrenome = entrada.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = entrada.nextInt();

        System.out.printf("\n\n%s %s tem %d anos", nome, sobrenome, idade);

        entrada.close();
    }
}
