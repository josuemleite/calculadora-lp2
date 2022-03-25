package geometria;

public class Circulo {

	// Atributos
	private double raio;
	
	// M�todos
	public void setRaio(double raio) {
		if (raio > 0) {
			this.raio = raio;
		}
	}
	
	public double calculaArea() {
		double area = Math.PI * raio * raio;
		
		return area;
	}
	
	// Esta fun��o incrementa os valores da linha e coluna de acordo com o di�metro,
	// ou seja, de -raio at� 0 e de 0 at� raio (-raio at� raio)
	// N�o � considerado o valor de pi no c�lculo
	// Por isso, para certificar que um determinado ponto (i, j) pertence � circunfer�ncia,
	// � calculado i� + j� <= raio�, uma vez que a linha e a coluna que formam a circunfer�ncia s�o
	// inversamente proporcionais entre si e a �nica situa��o em que s�o iguais
	// corresponde ao "eixo" da circunfer�ncia, isto �, a linha/coluna que possui mais pontos (.)
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
