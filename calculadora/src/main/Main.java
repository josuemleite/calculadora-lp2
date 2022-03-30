package main;

import java.util.List;
import java.util.Scanner;

import model.Calc;

public class Main {

	public static void main(String[] args) {

		Calc calc = new Calc();
		Scanner enter = new Scanner(System.in);

		System.out.println("*** Escolha a op��o  ***");
		System.out.println("1 - Soma");
		System.out.println("2 - Subtra��o");
		System.out.println("3 - Divis�o");
		System.out.println("4 - Multiplica��o");
		System.out.println("5 - Sair");
		int option = enter.nextInt();

		while (true) {

			List<String> operations = calc.getLastOperations();

			// Para usar switch em Java � necess�rio colocar {} ap�s cada case, sen�o d�
			// erro de duplicidado, por exemplo
			// O break fica ap�s as chaves
			switch (option) {
			case 1: {
				System.out.println("Digite a primeira parcela: ");
				double valueOne = enter.nextDouble();
				System.out.println("Digite a segunda parcela: ");
				double valueTwo = enter.nextDouble();
				System.out.println("Soma: " + valueOne + " + " + valueTwo + " = " + calc.sum(valueOne, valueTwo));
			}
				break;
			case 2: {
				System.out.println("Digite o minuendo: ");
				double valueOne = enter.nextDouble();
				System.out.println("Digite o subtraendo: ");
				double valueTwo = enter.nextDouble();
				System.out.println("Subtra��o: " + valueOne + " - " + valueTwo + " = " + calc.sub(valueOne, valueTwo));
			}
				break;
			case 3: {
				System.out.println("Digite o dividendo: ");
				double valueOne = enter.nextDouble();
				System.out.println("Digite o divisor: ");
				double valueTwo = enter.nextDouble();
				System.out.println("Divis�o: " + valueOne + " / " + valueTwo + " = " + calc.div(valueOne, valueTwo));
			}
				break;
			case 4: {
				System.out.println("Digite o primeiro fator: ");
				double valueOne = enter.nextDouble();
				System.out.println("Digite o segundo fator: ");
				double valueTwo = enter.nextDouble();
				System.out.println("Multiplica��o: " + valueOne + " * " + valueTwo + " = " + calc.mult(valueOne, valueTwo));
			}
				break;
			case 5: {
				System.out.println("Opera��es realizadas");
				for (String operation : operations) {
					System.out.println(operation);
				}
				return;
			}
			default:
				System.out.println("Op��o inv�lida!");
			}

			System.out.println("*** Escolha a op��o  ***");
			System.out.println("1 - Soma");
			System.out.println("2 - Subtra��o");
			System.out.println("3 - Divis�o");
			System.out.println("4 - Multiplica��o");
			System.out.println("5 - Sair");
			option = enter.nextInt();
		}
	}
}
