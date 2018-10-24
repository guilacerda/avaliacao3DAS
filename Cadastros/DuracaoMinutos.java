package Cadastros;

public class DuracaoMinutos {
    final static int umMinuto = 60;
    public int duracaoMinutos;

    public int duracaoMinutos(int minutosInicio, int minutosTermino) {
        if (minutosTermino > minutosInicio)
            duracaoMinutos = minutosTermino - minutosInicio;
        else {
            duracaoMinutos = umMinuto - minutosInicio + minutosTermino;
            if (duracaoMinutos == umMinuto)
                duracaoMinutos = 0;
        }
        return duracaoMinutos;
    }
}
