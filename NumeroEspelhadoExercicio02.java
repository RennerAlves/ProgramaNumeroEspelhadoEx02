package ListaDeExercícios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumeroEspelhadoExercicio02 {
	public static void main(String[] args) {

		double numero = 0.0;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Insira um número REAL: ");
		try {
			numero = scanner.nextDouble();
		} catch (InputMismatchException ex) {
			System.out.println("Erro! Insira um número real. Se possuir casas "
					+ "decimais, faça a separacação com vírgula.");
		}
		System.out.println();
		System.out.println("O número que você inseriu foi: " + numero);

	}

}
