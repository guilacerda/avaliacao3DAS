package Cadastros;

public class DuracaoHoras {
    public int duracaoHoras;
    public int horaInicio;
    public int horaTermino;
    public int minutosTermino;
    public int minutosInicio;

    public DuracaoHoras(int horaInicio, int horaTermino, int minutosInicio, int minutosTermino){
        this.horaInicio = horaInicio;
        this.horaTermino = horaTermino;
        this.minutosInicio = minutosInicio;
        this.minutosTermino = minutosTermino;
    }


    public int compute() {
        houveViagemDeHoras();

        if (horaTermino > horaInicio)
            if (horaTermino == horaInicio + 1) {
                durouMenosDeUmaHora();
            } else {
                durouMaisDeUmaHora();
            }
            
        return duracaoHoras;
    }

    private int houveViagemDeHoras() {
        if (horaTermino == horaInicio) {
            duracaoHoras = 0;
        }

        if (horaTermino < horaInicio) {
            duracaoHoras = -1;
        }

        return duracaoHoras;
    }

    private int durouMenosDeUmaHora() {
        if (horaTermino == horaInicio + 1) {
            if (minutosTermino < minutosInicio)
                duracaoHoras = 0;
            else
                duracaoHoras = 1;
        }
        return duracaoHoras;
    }

    private int durouMaisDeUmaHora(){
        if (horaTermino - horaInicio > 2)
            duracaoHoras = horaTermino - horaInicio;
        else if (horaTermino - horaInicio == 2 &&
                minutosTermino < minutosInicio)
            duracaoHoras = 1;
        else
            duracaoHoras = 2;

        return duracaoHoras;
    }
}
