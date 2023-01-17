package LoianeClass;
import java.util.Scanner;
public class Exer3Switch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com uma letra (F ou M): ");
		String imput = scan.next();

			if(imput.equalsIgnoreCase("f")){
				System.out.println("F - FEMININO");
				
			}else if(imput.equalsIgnoreCase("m")) { 
				System.out.println("M - MASCULINO"); 
			
			}else {
				System.out.println("SEXO INVALIDO");
			}
	}
}

	
	

