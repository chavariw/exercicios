package classe;

public class Data {

    int dia;
    int mes;
    int ano;

    Data() {
        dia = 1;
        mes = 1;
        ano = 1970;
    }

    Data(int diaInicial, int mesInicial, int anoInicial) {
        dia = diaInicial;
        mes = mesInicial;
        ano = anoInicial;
    }

    String obterDataFormatada() {

        String sDia = "";
        String sMes = "";

        if (dia < 10)
            sDia = "0" + dia;
        else
            sDia = Integer.toString(dia);

        if (mes < 10)
            sMes = "0" + mes;
        else
            sMes = Integer.toString(mes);

        return String.format("%s/%s/%d",sDia,sMes,ano);
    }

    void imprimirDataFormatada() {
        System.out.println(obterDataFormatada());
    }
}
