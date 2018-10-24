package Cadastros;

public class DuracaoHoras {
    public int duracaoHoras;

    public int duracaoHoras(int horaInicio, int horaTermino, int minutosInicio, int minutosTermino) {
        if (horaTermino == horaInicio)
            duracaoHoras = 0;
        if (horaTermino > horaInicio)
            if (horaTermino == horaInicio + 1) {
                if (minutosTermino < minutosInicio)
                    duracaoHoras = 0;
                else
                    duracaoHoras = 1;
            } else {
                if (horaTermino - horaInicio > 2)
                    duracaoHoras = horaTermino - horaInicio;
                else if (horaTermino - horaInicio == 2 &&
                        minutosTermino < minutosInicio)
                    duracaoHoras = 1;
                else
                    duracaoHoras = 2;
            }

        if (horaTermino < horaInicio)
            duracaoHoras = -1;
        return duracaoHoras;
    }
}
