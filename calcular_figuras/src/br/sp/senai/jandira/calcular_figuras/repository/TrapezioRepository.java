package br.sp.senai.jandira.calcular_figuras.repository;

import java.util.Scanner;

import br.sp.senai.jandira.calcular_figuras.model.Trapezio;

public class TrapezioRepository {
	public static void criarTrapezio () {
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("");
		System.out.println("Criando um trapézio...");
		System.out.print("Qual a medida da base menor do trapézio?");
		
		Trapezio trapezio = new Trapezio();
		
		trapezio.setBaseMenor(leitor.nextDouble());
		trapezio.exibirResultado();

		System.out.print("Qual a medida da base maior do trapézio?");
		
		trapezio.setBaseMaior(leitor.nextDouble());
		trapezio.exibirResultado();

		
		
		System.out.print("Qual a medida da altura do trapezio?");
		
		trapezio.setAltura(leitor.nextDouble());
		trapezio.exibirResultado();
		
		leitor.close();
	}
}
