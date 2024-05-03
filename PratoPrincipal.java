package br.com.ucb.restaurante;

public class PratoPrincipal extends Prato { 
	 // aqui estão as caracteristicas que serão puxadas e nomeadas para a main
	private String tipo_carne;
	private String tipo_bebida;
	private String molho;
	//aqui é meu construtor
	public PratoPrincipal(String nome, String ingredientes, double preco, String tipo_carne, String tipo_bebida,
			String molho) {
		super(nome, ingredientes, preco);
		this.tipo_carne = tipo_carne;
		this.tipo_bebida = tipo_bebida;
		this.molho = molho;
	}
     //get e set serve para acessar as propriedade das classes
	public String getTipo_carne() {
		return tipo_carne;
	}

	public void setTipo_carne(String tipo_carne) {
		this.tipo_carne = tipo_carne;
	}

	public String getTipo_bebida() {
		return tipo_bebida;
	}

	public void setTipo_bebida(String tipo_bebida) {
		this.tipo_bebida = tipo_bebida;
	}

	public String getMolho() {
		return molho;
	}

	public void setMolho(String molho) {
		this.molho = molho;
	}
	
	
	//esses são meus métodos

	@Override
	public void exibir_informacoes() {
		 System.out.println(getNome() + getIngredientes());
	}

    @Override
	public void calcular_preco() {
		  System.out.println("o preço é R$ " + getPreco()  );
		  
	}
	
	public void bebendo() {
		System.out.println("bebendo " + tipo_bebida + "..." );
	}
	
	public void mordendo() {
		System.out.println("mordendo " + tipo_carne + "...");
	}
	
	

}
