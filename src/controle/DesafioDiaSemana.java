package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe um dia da semana: ");
        String diaSemana = entrada.next();

        if (diaSemana.equalsIgnoreCase("domingo")) {
            System.out.println("Domingo é o dia 1 da semana.");
        } else if (diaSemana.equalsIgnoreCase("segunda")) {
            System.out.println("Segunda é o dia 2 da semana.");
        } else if (diaSemana.equalsIgnoreCase("terca") ||
                   diaSemana.equalsIgnoreCase("terça")) {
            System.out.println("Terça é o dia 3 da semana.");
        } else if (diaSemana.equalsIgnoreCase("quarta")) {
            System.out.println("Quarta é o dia 4 da semana.");
        } else if (diaSemana.equalsIgnoreCase("quinta")) {
            System.out.println("Quinta é o dia 5 da semana.");
        } else if (diaSemana.equalsIgnoreCase("sexta")) {
            System.out.println("Sexta é o dia 6 da semana.");
        }  else if (diaSemana.equalsIgnoreCase("sabado") ||
                diaSemana.equalsIgnoreCase("sábado")) {
            System.out.println("Sábado é o dia 7 da semana.");
        } else {
            System.out.println("Você digitou: " + diaSemana + " e é um dia inválido!");
        }

        entrada.close();

    }
}
