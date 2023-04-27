package view;

import java.util.Scanner;

import controller.Recursiva05;

public class Principal {
	public static void main(String[] args) {
		int num;
		try (Scanner leia = new Scanner(System.in)) {
			System.out.println("Digite os números");
			num=leia.nextInt();
		}
			int resultado = Recursiva05.contarDigitos(num);
		System.out.println("quantidade de digitos é " + resultado);
	}
}
