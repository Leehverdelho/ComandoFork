/*Análise de Idade: Peça a idade de 5 pessoas e informe quantas 
 * são maiores de idade (idade >= 18).
 */
//Desenvolvido por Leticia Verdelho Ribeiro.
import java.util.Scanner;
public class Ex11 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		int cont = 0;
		int contMenor = 0;
		
		for (int i = 0; i < 5 ; i++) {
			
			System.out.print("Digite a sua Idade: ");
			int idade = scanner.nextInt();
			
			if (idade >= 18 ) {
				
				cont = cont + 1;
				
			}
			else {
				
				contMenor = contMenor + 1;
				
			}
			
		}
		
		System.out.println("A quantidade de Pessoas maiores de idade é: " + cont);
		System.out.println("A quantidade de Pessoas menores de idade é: " + contMenor);

	}

}
