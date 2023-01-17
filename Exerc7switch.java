package LoianeClass;
import java.util.Scanner;
public class Exerc7switch {

	public static void main(String[] args) {
		// Faça uma API que leia três numeros e mostre o maior deles. 

		Scanner input = new Scanner (System.in);
		int numero1, numero2, numero3;
	
		
		System.out.printf("\n Entre com um número. ");
		int numero11	= input.nextInt();
		System.out.printf("\n Entre com um número. ");
		int numero21 = input.nextInt();
		System.out.printf("\n Entre com um número. ");
		int numero31 = input.nextInt();
	
		 if((numero11> numero21) && (numero11> numero31)){
         
         System.out.print("O maior é: "+numero11);
         }
		 else if ((numero21 >numero31) && (numero21> numero11)){
         
         System.out.print("O maior é: "+numero21);
         }
		 else if (numero31> numero11) &&  (numero31> numero21){
          
          System.out.print("O maior é: "+numero3);
          }
          
          System.out.print("Entre: "+numero1+numero2+numero3);
	}
}
