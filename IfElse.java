package LoianeClass;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		/*System.out.println("\n Entre com a sua idade ");
		int idade = scan.nextInt();
		
		if(idade>=18) {
			System.out.println("\n… maior de idade");
			
		}
		else {
			System.out.println("\nN„o È maior de idade");
		
		}*/
		//barato <=10
		//10 < valor <15 - desconto
		//15 <= valor 17 - pesquisar
		//>=17 = muito caro
		
		System.out.println("\nEntre com um valor: ");
		double valor = scan.nextDouble();
		
		if(valor <=10) {
			System.out.println("\nPode comprar");
		} else if (valor >10 && valor <15) {
			System.out.println("\nPedir Desconto!");
		}else if(valor >=15 && valor <17)
			System.out.println("\nPesquisar");
		else {// >=17
		System.out.println("\nMuito caro, comprar em outro lugar");
	}
	}
}

