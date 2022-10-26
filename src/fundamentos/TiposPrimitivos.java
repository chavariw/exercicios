package fundamentos;

public class TiposPrimitivos {

    public static void main(String[] args) {
        // Informações do funcionario

        // Tipos numéricos inteiros
        byte anosDeEmpresa = 23; //127
        short numeroDeVoos = 542; //32767
        int id = 56789; //2 milhoes aproximadamente
        // colocando o L no final o JAVA entende que o nro é um LONG e não mais INT
        long pontosAcumulados = 3_134_845_223L;

        // Tipos numéricos reais (ponto flutuante)
        // colocando o F no final o JAVA entende que o nro é um FLOAT
        float salario = 11_445.44F;
        double vendasAcumuladas = 2_991_797_103.01;

        // Tipo Booleano
        boolean estaDeFerias = false; // true

        // Tipo caractere
        char status = 'A';
        // char status = '\u0010';

        // Dias de empresa
        System.out.println(anosDeEmpresa * 369);

        // Numeros de viagens
        System.out.println(numeroDeVoos / 2);

        // Pontos por real
        System.out.println(pontosAcumulados / vendasAcumuladas);

        System.out.println(id + "ganha ->  " + salario);
        System.out.println("Férias? " + estaDeFerias );
        System.out.println("Status: " + status );



    }
}
