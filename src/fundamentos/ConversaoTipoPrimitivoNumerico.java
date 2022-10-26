package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

    public static void main(String[] args) {

        double a = 1; // implicita
        System.out.println(a);

        float b = (float) 1.1234567888888; // explicita (CAST)
        System.out.println(b);

        int c = 4;
        byte d = (byte) c; // explicita (CAST)
        System.out.println(d);
    }
}
