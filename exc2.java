/* Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).*/
package exercicio;
import java.util.Scanner;

public class exc2 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		float x, y;
		
		System.out.println("Digite o valor de x:");
		x = sc.nextFloat();
			
		System.out.println("Digite o valor de y:");
		y = sc.nextFloat();
		
		while (x != 0 && y != 0) {
			
			
			if (x > 0 && y > 0) {
				System.out.println("PRIMEIRO QUADRANTE");
			
			}else if (x < 0 && y > 0) {
				System.out.println("SEGUNDO QUADRANTE");
			
			}else if (x < 0 && y < 0) {
				System.out.println("TERCEIRO QUADRANTE");
			
			}else if (x > 0 && y < 0) {
				System.out.println("QUARTO QUADRANTE");				
				
			}
			
			System.out.println("Digite o valor de x:");
			x = sc.nextFloat();
				
			System.out.println("Digite o valor de y:");
			y = sc.nextFloat();
		}	
		
		sc.close();
	}

}
