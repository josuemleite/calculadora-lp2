package main;

import java.util.List;
import java.util.Scanner;

import model.Calc;

public class Main {

	public static void main(String[] args) {

		Calc calc = new Calc();
		Scanner enter = new Scanner(System.in);

		System.out.println("*** Escolha a opção  ***");
		System.out.println("1 - Soma");
		System.out.println("2 - Subtração");
		System.out.println("3 - Divisão");
		System.out.println("4 - Multiplicação");
		System.out.println("5 - Sair");
		int option = enter.nextInt();

		while (true) {

			List<String> operations = calc.getLastOperations();

			// Para usar switch em Java é necessário colocar {} após cada case, senão dá
			// erro de duplicidado, por exemplo
			// O break fica após as chaves
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
				System.out.println("Subtração: " + valueOne + " - " + valueTwo + " = " + calc.sub(valueOne, valueTwo));
			}
				break;
			case 3: {
				System.out.println("Digite o dividendo: ");
				double valueOne = enter.nextDouble();
				System.out.println("Digite o divisor: ");
				double valueTwo = enter.nextDouble();
				System.out.println("Divisão: " + valueOne + " / " + valueTwo + " = " + calc.div(valueOne, valueTwo));
			}
				break;
			case 4: {
				System.out.println("Digite o primeiro fator: ");
				double valueOne = enter.nextDouble();
				System.out.println("Digite o segundo fator: ");
				double valueTwo = enter.nextDouble();
				System.out.println("Multiplicação: " + valueOne + " * " + valueTwo + " = " + calc.mult(valueOne, valueTwo));
			}
				break;
			case 5: {
				System.out.println("Operações realizadas");
				for (String operation : operations) {
					System.out.println(operation);
				}
				return;
			}
			default:
				System.out.println("Opção inválida!");
			}

			System.out.println("*** Escolha a opção  ***");
			System.out.println("1 - Soma");
			System.out.println("2 - Subtração");
			System.out.println("3 - Divisão");
			System.out.println("4 - Multiplicação");
			System.out.println("5 - Sair");
			option = enter.nextInt();
		}
	}
}
