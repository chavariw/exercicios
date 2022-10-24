package fundamentos;

public class Temperatura {

    public static void main(String[] args) {
        //(ºF - 32) x 5/9 = ºC
        double tempF = 21.0;
        final int AJUSTE = 32;
        final double FATOR = 5/9.0;
        double tempC = (tempF - AJUSTE) * FATOR;

        System.out.println("A temperatura " + tempF + "ºF equivale à " + tempC + "ºC.");
    }

}
