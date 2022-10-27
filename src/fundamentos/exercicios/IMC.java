package fundamentos.exercicios;

import java.util.Scanner;

public class IMC {

    public static void main(String[] args) {
        // IMC = peso / altura ^2
        Scanner entrada = new Scanner(System.in);

        System.out.printf("Informe seu nome: ");
        String nome = entrada.next();

        System.out.print("Informe seu peso: ");
        double peso = entrada.nextDouble();

        System.out.print("Informe sua altura: ");
        double altura = entrada.nextDouble();

        double divisor = Math.pow(altura,2);
        double imc = peso / divisor;

        System.out.printf("%s, seu IMC é %.2f!",nome,imc);

        entrada.close();
    }
}
