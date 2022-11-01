package classe.desafio;

public class Pessoa {
    String nome;
    double peso;

    Pessoa() {

    }

    Pessoa(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public void comer(Comida c) {
        this.peso += c.peso;
    }
}
