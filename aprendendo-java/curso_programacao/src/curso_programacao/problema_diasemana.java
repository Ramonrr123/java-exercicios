package curso_programacao;

import java.util.Scanner;

public class problema_diasemana {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("digite o numero do dia");

		int x = sc.nextInt();
		String dia;

		switch (x) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia = "terça";
			break;
		case 4:
			dia = "quarta";
			break;
		case 5:
			dia = "quinta";
			break;
		case 6:
			dia = "sexta";
			break;
		case 7:
			dia = "sabado";
			break;

		default:
			dia = "valor invalido";

		}

		System.out.println("Dia da semana:" + dia);

	}

}
