package LoianeClass;

import java.util.Scanner;

public class SwitchCase {

	private static final int DiaSemana = 0;

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println ("\n Entre com um numero da semana: ");
		int DiaSemana = scan.nextInt();
		
		
		if(DiaSemana ==1) {
			System.out.println ("Domingo");
		}else if(DiaSemana ==2) {
			System.out.println ("Segunda");
		}else if(DiaSemana ==3) {
			System.out.println ("Terca");
	}else if(DiaSemana ==4) {
		System.out.println ("Quarta");
	}else if(DiaSemana ==5) {
		System.out.println ("Quinta");
	}else if(DiaSemana ==6) {
		System.out.println ("Sexta");
	}else if(DiaSemana ==7) {
		System.out.println ("Sabado");
	}else 
		System.out.println ("\n Entre com um número valido");
	}{
	
		switch(DiaSemana) 
		{
	case 1: System.out.println ("Domingo"); break;
	case 2: System.out.println ("Segunda"); break;
	case 3: System.out.println ("Terca");	break;
	case 4: System.out.println ("Quarta");  break;
	case 5: System.out.println ("Quinta");	break;
	case 6: System.out.println ("Sexta");	break;	
	case 7: System.out.println ("Sabado");  break;
	default: System.out.println ("\n Entre com um número valido");
		
		}
	}
}
