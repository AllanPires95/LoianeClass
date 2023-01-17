package LoianeClass;
import java.util.Scanner;
public class ExercSwitch {

	public static void main(String[] args) {
		// Fazer um programa para a leitura de duas notas parciais de um aluno. Calcular média alcançada por um aluno e apresentar.
			
		Scanner ler = new Scanner (System.in);
		int x;
		float n1,n2,n3, media, SomaMedia=0,MediaGeral=0;
		
		System.out.printf("\nDigite a  primeira nota do aluno: ");
		n1 = ler.nextFloat();
		System.out.printf("\nDigite a segunda nota do aluno: ");
		n2 = ler.nextFloat();
		System.out.printf("\nDigite a terceira nota do aluno: ");
		n3 = ler.nextFloat();
		
		media = (n1+n2+n3)/3;
		System.out.printf("\nMédia: %.2f", media);		
	
	MediaGeral = media;
	System.out.printf("\nMédia Geral: %.2f ",MediaGeral);
	
	if(MediaGeral>=7) {
		System.out.printf("\nAluno Aprovado");
	}
	else if (MediaGeral>=6 && MediaGeral <7) {
		System.out.printf("\nAluno De Recuperação");
	}
	else if (MediaGeral<6) {
		System.out.printf("\nAluno Reprovado");
	}
	else if(MediaGeral == 10) {	
		System.out.printf("\nAprovado com Distincão");
	}
	}
}
	
	

