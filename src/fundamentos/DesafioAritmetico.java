package fundamentos;

public class DesafioAritmetico {

    public static void main(String[] args) {

        int a = 6 * (3 + 2);
        int b = (int) Math.pow(a,2);
        int c = 3 * 2;
        int d = ((1 - 5) * (2 - 7)) / 2;
        int e = (int) Math.pow(d,2);
        int f = ((b / c) - e);
        int g = (int) Math.pow(f,3) / (int) Math.pow(10,3);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(b / c);
        System.out.println(f);
        System.out.println(g);


    }
}
