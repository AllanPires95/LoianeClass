package LoianeClass;
import java.util.Scanner;
public class Exer4Switch {

public static void main (String [] args) {

		// Faca um programa que verifique se a letra � vogal ou consoante.
		Scanner scan = new Scanner (System.in);
				
		System.out.println("\nEntre com a letra");
		String letra=scan.next();
		
		if (letra.equalsIgnoreCase("A") ||  (letra.equalsIgnoreCase("e") || 
			(letra.equalsIgnoreCase("I") || (letra.equalsIgnoreCase("O") || (letra.equalsIgnoreCase("u")))))){
					 System.out.println("\nEssa letra � uma vogal");
					 
		}
		else {
			System.out.println("\n Essa letra � uma consoante");
			
		}
	}
}


	

				 

