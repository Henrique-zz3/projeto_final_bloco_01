package produto.model;

public class ProdutoXbox extends Produto{

	private boolean gamePass;
	
	public ProdutoXbox(int numero, int console, int ano, String nome, String categoria, float valor, boolean gamePass) {
		super(numero, console, ano, nome , categoria, valor);
		this.setGamePass(gamePass);
		
	}

	public boolean isGamePass() {
		return gamePass;
	}

	public void setGamePass(boolean exclusivo) {
		this.gamePass = exclusivo;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		
		if(gamePass == true) {
			System.out.println("Tem no Game Pass");
		}else {
			System.out.println("Não tem no Game Pass");
		}
	}	
	
	
}