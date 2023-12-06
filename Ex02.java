package atividade8ponto4;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float nota1, nota2, nota3, nota4;
		float media;
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("\nDigite a primeira nota: \n");
		nota1 = leia.nextFloat();
		
		System.out.println("\nDigite a segunda nota: \n");
		nota2 = leia.nextFloat();
		
		System.out.println("\nDigite a terceira nota: \n");
		nota3 = leia.nextFloat();
		
		System.out.println("\nDigite a quarta nota: \n");
		nota4 = leia.nextFloat();
		
		leia.close();
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;	
		
		System.out.printf("A média final é: %.1f", media);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
