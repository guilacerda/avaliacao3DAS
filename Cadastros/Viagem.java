package Cadastros;

public class Viagem {

	private int horaInicio;
	private int minutosInicio;
	private int horaTermino;
	private int minutosTermino;
	private int duracaoTotalMinutos;

	private Viagem(int hora, int minutos) {
		this.horaInicio = hora;
		this.minutosInicio = minutos;
	}

	protected static Viagem obterViagem(int hora, int minutos) {
		Viagem viagem = new Viagem (hora, minutos);
		return viagem;
	}

	public int getHoraInicio() {
		return horaInicio;
	}

	public int getMinutoInicio() {
		return minutosInicio;
	}

	public void encerrarViagem(int horaTermino, int minutosTermino) {
		this.horaTermino = horaTermino;
		this.minutosTermino = minutosTermino;
	}

	public int getHoraTermino() {
		return horaTermino;
	}

	public int getMinutosTermino() {
		return minutosTermino;
	}

	public int getDuracaoHoras() {
		DuracaoHoras duracaoHora = new DuracaoHoras(horaInicio, horaTermino, minutosInicio, minutosTermino);
		return duracaoHora.compute();
	}

	public int getDuracaoMinutos() {
		DuracaoMinutos duracaoMin = new DuracaoMinutos();
		return duracaoMin.duracaoMinutos(minutosInicio, minutosTermino);
	}

	public int getDuracaoTotalMinutos() {
		duracaoTotalMinutos = getDuracaoHoras() * 60 + getDuracaoMinutos();
		return duracaoTotalMinutos;
	}

}
