package classe.desafio;

public class Jantar {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("João",75.5);
        double pesoAntes = p1.peso;
        Comida c1 = new Comida("Arroz",0.250);
        Comida c2 = new Comida("Feijão",0.300);
        Comida c3 = new Comida("Frango",0.220);

        p1.comer(c1);
        p1.comer(c2);
        p1.comer(c3);

        System.out.printf("%s pesava %.2f Kg antes da refeição; após ficou com %.2f Kg.",
                p1.nome,pesoAntes,p1.peso);
    }
}
