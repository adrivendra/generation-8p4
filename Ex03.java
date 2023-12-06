package atividade8ponto4;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float salarioBruto, adicionalNot, horaExtra, descontos, salarioLiquido;
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o Salário Bruto: \n");
		salarioBruto = leia.nextFloat();
		
		System.out.println("\nDigite o Adicional Noturno: \n");
		adicionalNot = leia.nextFloat();
		
		System.out.println("\nDigite a Hora Extra: \n");
		horaExtra = leia.nextFloat();
		
		System.out.println("\nDigite os Descontos: \n");
		descontos = leia.nextFloat();
		
		leia.close();
		
		salarioLiquido = salarioBruto + adicionalNot + (horaExtra *5) - descontos;
		
		System.out.printf("O salário líquido é: R$ %.2f", salarioLiquido);
		
		
	}

}
