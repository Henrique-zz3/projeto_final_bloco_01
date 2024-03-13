package produto.model;

public class ProdutoPlay extends Produto{
	
	private boolean exclusivo;
	
	public ProdutoPlay(int numero, int console, int ano, String nome, String categoria, float valor, boolean exclusivo) {
		super(numero, console, ano, nome , categoria, valor);
		this.setExclusivo(exclusivo);
		
	}

	public boolean isExclusivo() {
		return exclusivo;
	}

	public void setExclusivo(boolean exclusivo) {
		this.exclusivo = exclusivo;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		
		if(exclusivo == true) {
			System.out.println("Exclusivo PlayStation");
		}else {
			System.out.println("Não exclusivo");
		}
		
	}

}
