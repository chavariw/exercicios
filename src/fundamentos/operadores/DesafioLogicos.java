package fundamentos.operadores;

import com.sun.jdi.connect.Connector;

public class DesafioLogicos {

    public static void main(String[] args) {
        // Trabalho na terça (V ou F)
        // Trabalho na quinta (V ou F)
        // 2 V = TV 50 POLEGADAS + Sorvete
        // 1 V = TV 32 POLEGADAS + Sorvete
        // 2 F = sem TV e sem Sorvete

        boolean trabalhoTerca = true;
        boolean trabalhoQuinta = true;

        boolean comprouTV50 = trabalhoTerca && trabalhoQuinta;
        boolean comprouTV32 = trabalhoTerca ^ trabalhoQuinta;
        boolean comprouSorvete = trabalhoTerca || trabalhoQuinta;
        //Operador Unario
        boolean maisSaudavel = !comprouSorvete;

        System.out.println("Comprou TV 50 \"? " + comprouTV50);
        System.out.println("Comprou TV 32 \"? " + comprouTV32);
        System.out.println("Comprou Sorvete \"? " + comprouSorvete);
        System.out.println("Mais saldável \"? " + maisSaudavel);
    }
}
