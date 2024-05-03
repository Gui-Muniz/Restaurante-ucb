package br.com.ucb.restaurante;

public class Prato {
	 // aqui estão as caracteristicas que serão puxadas e nomeadas para a main
  private String nome;
  private String ingredientes;
  private double preco;
  
  //aqui é meu construtor
public Prato(String nome, String ingredientes, double preco) {
	super();
	this.nome = nome;
	this.ingredientes = ingredientes;
	this.preco = preco;
}
  
 
//get e set serve para acessar as propriedade das classes
public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getIngredientes() {
	return ingredientes;
}

public void setIngredientes(String ingredientes) {
	this.ingredientes = ingredientes;
}

public double getPreco() {
	return preco;
}

public void setPreco(double preco) {
	this.preco = preco;
}
  //aqui são meus metodos

public void exibir_informacoes() {
	 System.out.println(nome + " " + ingredientes);
}


public void calcular_preco() {
	  System.out.println("o preço é R$ " + preco  );
	  
}

}
