package geometria;

public class Circulo {

	// Atributos
	private double raio;
	
	// Métodos
	public void setRaio(double raio) {
		if (raio > 0) {
			this.raio = raio;
		}
	}
	
	public double calculaArea() {
		double area = Math.PI * raio * raio;
		
		return area;
	}
	
	// Esta função incrementa os valores da linha e coluna de acordo com o diâmetro,
	// ou seja, de -raio até 0 e de 0 até raio (-raio até raio)
	// Não é considerado o valor de pi no cálculo
	// Por isso, para certificar que um determinado ponto (i, j) pertence à circunferência,
	// é calculado i² + j² <= raio², uma vez que a linha e a coluna que formam a circunferência são
	// inversamente proporcionais entre si e a única situação em que são iguais
	// corresponde ao "eixo" da circunferência, isto é, a linha/coluna que possui mais pontos (.)
	public void desenhar() {
		for (double i = -raio; i <= raio; i++) {
			for (double j = -raio; j <= raio; j++) {
				if (i * i + j * j <= raio * raio) {
					System.out.print(". ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
