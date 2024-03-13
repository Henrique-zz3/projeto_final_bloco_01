package produto.model;

public abstract class Produto {
	
	private int numero;
	private int console;
	private int ano;
	private String nome;
	private String categoria;
	private float valor;

	public Produto(int numero, int console, int ano, String nome, String categoria, float valor) {
		
		this.setNumero(numero);
		this.setConsole(console);
		this.setAno(ano);
		this.setNome(nome);
		this.setCategoria(categoria);
		this.setValor(valor);
		
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getConsole() {
		return console;
	}

	public void setConsole(int console) {
		this.console = console;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	
public void visualizar() {
		
		String tipo = "";

		switch (this.console) {
			case 1 -> {
				tipo = "Playstation";
				break;
			}
			case 2 -> {
				tipo = "Xbox";
				break;
			}
		}

		System.out.println("\n\n***********************************************************");
		System.out.println("Dados do jogo:");
		System.out.println("***********************************************************");
		System.out.println("Numero identificador: " + this.numero);
		System.out.println("Nome: " + this.nome);
		System.out.println("Ano: " + this.ano);
		System.out.println("Console: " + tipo);
		System.out.println("Categoria: " + this.categoria);
		System.out.println("Valor: " + this.valor);

		
	}
	
}
