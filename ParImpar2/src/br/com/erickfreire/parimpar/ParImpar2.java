package br.com.erickfreire.parimpar;

import java.util.Scanner;

/**
 * Programa em Java com uma função que verifica se um valor é par ou ímpar
 * @author Erick Freire
 * @version 1 - Criado em 30-04-2021 as 15:15
 */

public class ParImpar2 {

	public static void main(String[] args) {
		
		int numero;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Programa que informa se um valor é par ou ímpar: ");
		
		System.out.print("Informe um número: ");
		numero = entrada.nextInt();
		
		parImpar(numero);

	}
	
	public static void parImpar(int n) {
		int res = n % 2;
		
		if(res == 0) {
			System.out.println("\nNúmero par!");
		} else {
			System.out.println("\nNúmero Ímpar!");
		}
	}

}
