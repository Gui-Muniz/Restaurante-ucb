package br.com.ucb.main;
//aqui estou importando minhas classes
import br.com.ucb.restaurante.PratoPrincipal;
import br.com.ucb.restaurante.Sobremesa;
//aqui é onde ire instanciar meu código, fazer tudo acontecer de fato.
public class Main {

	public static void main(String[] args) {
		PratoPrincipal objPratoprincipal = new PratoPrincipal("Strogonoff ", " arroz branco, batata palha", 20.99, "frango", "vinho", "ketchup e mostarda");
	
	objPratoprincipal.exibir_informacoes();
	objPratoprincipal.calcular_preco();
	objPratoprincipal.bebendo();
	objPratoprincipal.mordendo();
	
	
	
	Sobremesa objSobremesa = new Sobremesa("sundae", " sorvete, calda, amendoim", 14.99, "sorvete", "grande", "calda de morango");
	objSobremesa.recomendar_sobremesa();
	objSobremesa.exibir_informacoes();
	objSobremesa.calcular_preco();
	
	
	}
// projeto concluido :)
}
