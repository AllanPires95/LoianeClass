package LoianeClass;
import java.util.Scanner;
public class Exer02Switch {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Entre com o numero");
		int num = scan.nextInt();
		
		if (num>=0) {
			System.out.println("O numero informado é positivo");
		}else {
			System.out.println("O numero informado é negativo");
		}
			
	}
}
