package calculadoradevotos;

public class Main {

	public static void main(String[] args) {
		
		ControlaVotos calculadora = new ControlaVotos(1000, 800, 150, 50);

		double percentualVotosValidos = calculadora.calcularPercentualVotosValidos();
		System.out.println("Votos válidos: " + percentualVotosValidos + "%");

		double percentualVotosBrancos = calculadora.calcularPercentualVotosBrancos();
		System.out.println("Votos em branco: " + percentualVotosBrancos + "%");

		double percentualVotosNulos = calculadora.calcularPercentualVotosNulos();
		System.out.println("Votos nulos: " + percentualVotosNulos + "%");

	}

}
