package br.sp.senai.jandira.calcular_figuras.repository;
import br.sp.senai.jandira.calcular_figuras.model.Retangulo;
import java.util.Scanner;

	public class RetanguloRepository {
		public static void criarRetangulo () {
			
			Scanner leitor = new Scanner(System.in);
			
			Retangulo retangulo = new Retangulo();
			
			System.out.println("Criando um retângulo...");
			System.out.print("Qual a medida da base do retângulo?");
			
			retangulo.setBase(leitor.nextDouble());
			retangulo.exibirResultado();
			
			
			
			System.out.print("Qual a medida da altura do retângulo?");
		
			retangulo.setAltura(leitor.nextDouble());
			retangulo.exibirResultado();
			
			
			leitor.close();
		}
			
			
}
