package ListaDeExerc�cios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumeroEspelhadoExercicio02 {
	public static void main(String[] args) {

		double numero = 0.0;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Insira um n�mero REAL: ");
		try {
			numero = scanner.nextDouble();
		} catch (InputMismatchException ex) {
			System.out.println("Erro! Insira um n�mero real. Se possuir casas "
					+ "decimais, fa�a a separaca��o com v�rgula.");
		}
		System.out.println();
		System.out.println("O n�mero que voc� inseriu foi: " + numero);

	}

}
