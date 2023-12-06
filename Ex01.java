package atividade8ponto4;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float salario, abono;
		float novoSalario;
		
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\nDigite o Salário: \n");
		salario = leia.nextFloat();
		
		System.out.println("\nDigite o Abono: \n");
		abono = leia.nextFloat();
		
		leia.close();
		
		novoSalario = salario + abono;
		
		System.out.printf("O novo salário é: R$ %.2f", novoSalario);
		
		
		
		
	}

}
