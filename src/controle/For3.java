package controle;

public class For3 {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    System.out.printf("[%d%d%d]\n",i,j,k);
                }
                //System.out.printf("[%d%d]\n",i,j);
            }
            //System.out.println(i);
        }

        //int i = 0;
        //System.out.println("Saiu do for...");
        //System.out.println(i);
    }
}
