package atividade8ponto4;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float n1, n2, n3, n4, calculo;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o primeiro numero: \n");
		n1 = leia.nextFloat();
		
		System.out.println("\nDigite o segundo numero: \n");
		n2 = leia.nextFloat();
		
		System.out.println("\nDigite o terceiro numero: \n");
		n3 = leia.nextFloat();
		
		System.out.println("\nDigite o quarto numero: \n");
		n4 = leia.nextFloat();
		
		leia.close();
		
		calculo = (n1 * n2) - (n3 * n4);
		
		System.out.printf("A diferença dos numeros é: %.1f", calculo);
	
	}

}
