package produto;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import produto.controller.ProdutoController;
import produto.model.ProdutoPlay;
import produto.model.ProdutoXbox;

public class Menu {

	public static void main(String[] args) {
		
		ProdutoController jogos = new ProdutoController();
		
		int opcao, ano, console, numero;
		String categoria, nome;
		float valor;
		boolean exclusivo, gamePass;
		
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
			System.out.println("            3 - Consultar dados do jogo              ");
			System.out.println("            4 - Atualizar jogos                      ");
			System.out.println("            5 - Excluir jogo                         ");
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
				
				System.out.println("Digite o nome do jogo: ");
				read.skip("\\R?");
				nome = read.nextLine();
				
				System.out.println("Digite a categoria: ");
				categoria = read.nextLine();
				
				System.out.println("Digite o ano: ");
				ano = read.nextInt();
				
				System.out.println("Digite o valor: ");
				valor = read.nextFloat();
				
				do {
					System.out.println("Digite o Tipo de Console ( 1 - PlayStation ou 2 - Xbox)");
					console = read.nextInt();
				}while(console < 1 && console > 2);
				
				switch(console) {
					case 1  -> {
						System.out.println("Digite se o jogo é um exclusivo (true ou false) ");
						exclusivo = read.nextBoolean();
						jogos.cadastrar(new ProdutoPlay(jogos.gerarNumero(), console, ano, nome, categoria, valor, exclusivo));
					}
					
					case 2  -> {
						System.out.println("Digite se o jogo tem no game pass (true ou false) ");
						gamePass = read.nextBoolean();
						jogos.cadastrar(new ProdutoXbox(jogos.gerarNumero(), console, ano, nome, categoria, valor, gamePass));
					}
				}
				
				
				keyPress();
				break;
				
			case 2:
				System.out.println("Listar todos os jogos\n\n");
				jogos.listarTodos();
				
				keyPress();
				break;
				
			case 3:
				System.out.println("Consultar dados do jogo - por número\n\n");
				
				System.out.println("Digite o número do jogo: ");
				numero = read.nextInt();
				
				jogos.procurarPorNumero(numero);
				
				break;
				
			case 4:
				System.out.println("Atualizar jogos\n\n");
				
				System.out.println("Digite o número do jogo: ");
				numero = read.nextInt();
				
				var buscaJogo = jogos.buscarNaCollection(numero);
				
				if(buscaJogo != null) {
					
					console = buscaJogo.getConsole();
					
					System.out.println("Digite o nome do jogo ");
					read.skip("\\R?");
					nome = read.nextLine();
					System.out.println("Digite a categoria: ");
					read.skip("\\R?");
					categoria = read.nextLine();
					
					System.out.println("Digite o ano: ");
					ano = read.nextInt();
					
					System.out.println("Digite o valor(R$): ");
					valor = read.nextFloat();
					
					switch(console) {
					case 1  -> {
						System.out.println("Digite se o jogo é um exclusivo (true ou false) ");
						exclusivo = read.nextBoolean();
						jogos.cadastrar(new ProdutoPlay(numero, console, ano, nome, categoria, valor, exclusivo));
					}
					
					case 2  -> {
						System.out.println("Digite se o jogo tem no game pass (true ou false) ");
						gamePass = read.nextBoolean();
						jogos.cadastrar(new ProdutoXbox(numero, console, ano, nome, categoria, valor, gamePass));
					}
				}
						
				}else {
					
					System.out.println("A Conta não foi encontrada!");
					
				}
				
				
				keyPress();
				break;
				
			case 5:
				System.out.println("Excluir jogo\n\n");
				
				System.out.println("Digite o número do jogo: ");
				numero = read.nextInt();
				
				jogos.deletar(numero);
				
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
