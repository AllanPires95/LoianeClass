package LoianeClass;

import java.util.Scanner;

public class Exer1415 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("\n\t Entre com o primeiro numero: ");
		int num1 = scan.nextInt();
		System.out.println("\n\t Entre com o segundo numero: ");
		int num2 = scan.nextInt();
		 
		
		if(num1 > num2) {
			System.out.printf("O num1 é maior: ", +num1);
		}else
		System.out.printf("O num2 é maior: "+num2);
	}
	
}
