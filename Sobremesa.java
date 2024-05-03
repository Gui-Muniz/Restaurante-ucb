package br.com.ucb.restaurante;

public class Sobremesa extends Prato {
    // aqui estão as caracteristicas que serão puxadas e nomeadas para a main
	private String tipo_doce;
	private String tamanho_porcao;
	private String acompanhamento;
	
	//aqui é meu construtor
	public Sobremesa(String nome, String ingredientes, double preco, String tipo_doce, String tamanho_porcao,
			String acompanhamento) {
		super(nome, ingredientes, preco);
		this.tipo_doce = tipo_doce;
		this.tamanho_porcao = tamanho_porcao;
		this.acompanhamento = acompanhamento;
	}

	//get e set serve para acessar as propriedade das classes
	public String getTipo_doce() {
		return tipo_doce;
	}

	public void setTipo_doce(String tipo_doce) {
		this.tipo_doce = tipo_doce;
	}

	public String getTamanho_porcao() {
		return tamanho_porcao;
	}

	public void setTamanho_porcao(String tamanho_porcao) {
		this.tamanho_porcao = tamanho_porcao;
	}

	public String getAcompanhamento() {
		return acompanhamento;
	}

	public void setAcompanhamento(String acompanhamento) {
		this.acompanhamento = acompanhamento;
	}
	
	// aqui serão meus métodos
	
	@Override
	public void exibir_informacoes() {
		 System.out.println(getNome() + getIngredientes());
	}

   @Override
	public void calcular_preco() {
		  System.out.println("o preço é R$ " + getPreco()  );
		  
	}
	
public void recomendar_sobremesa() {
		System.out.println("a sobremesa recomendada é " + tipo_doce);
	}
	
}
