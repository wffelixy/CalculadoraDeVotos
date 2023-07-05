package calculadoradevotos;

public class ControlaVotos {

	private int totalEleitores;
	private int votosValidos;
	private int votosBrancos;
	private int votosNulos;

	public ControlaVotos(int totalEleitores, int votosValidos, int votosBrancos, int votosNulos) {
		this.totalEleitores = totalEleitores;
		this.votosValidos = votosValidos;
		this.votosBrancos = votosBrancos;
		this.votosNulos = votosNulos;
	}

	public double calcularPercentualVotosValidos() {
		return (double) votosValidos / totalEleitores * 100;
	}

	public double calcularPercentualVotosBrancos() {
		return (double) votosBrancos / totalEleitores * 100;
	}

	public double calcularPercentualVotosNulos() {
		return (double) votosNulos / totalEleitores * 100;
	}
}
