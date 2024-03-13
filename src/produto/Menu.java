package produto;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		
		int opcao, ano, console, numero;
		String categoria, nome;
		float valor;
		
		Scanner read = new Scanner(System.in);

		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                      GenGames                       ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Cadastrar jogo                       ");
			System.out.println("            2 - Listar todos os jogos                ");
			System.out.println("            3 - Atualizar jogos                      ");
			System.out.println("            4 - Excluir jogo                         ");
			System.out.println("            0 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          \n");

			try {
				
				opcao = read.nextInt();

			}catch(InputMismatchException err) {
				System.out.println("\nDigite valores inteiros!");
				read.nextLine();
				opcao = 0;
				
			}
			

			switch (opcao) {
			case 1:
				System.out.println("Cadastrar jogo\n\n");
				
				
				keyPress();
				break;
				
			case 2:
				System.out.println("Listar todos os jogos\n\n");
				
				keyPress();
				break;
			case 3:
				System.out.println("Atualizar jogos\n\n");
				
				keyPress();
				break;
				
			case 4:
				System.out.println("Excluir jogo\n\n");
				
				keyPress();
				break;
				
			case 0:
				System.out.println("\n  GenGames - Onde você encontra a sua diverção ");
				read.close();
				System.exit(0);
				
				break;
				
			default:

				
				break;
			}
		}
		
	}

	public static void keyPress() {
		try {
			
			System.out.println("\n\n Precione Enter para continuar...");
			System.in.read();
			
		}catch(IOException err) {
			
			System.out.println("Você pressionou uma tecla diferente de enter!");
			
		}
	}
}
