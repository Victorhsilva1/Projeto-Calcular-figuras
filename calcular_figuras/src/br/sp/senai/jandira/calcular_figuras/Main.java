package br.sp.senai.jandira.calcular_figuras;

import br.sp.senai.jandira.calcular_figuras.model.Menu;
import br.sp.senai.jandira.calcular_figuras.model.Quadrado;
import br.sp.senai.jandira.calcular_figuras.model.Retangulo;
import br.sp.senai.jandira.calcular_figuras.model.Trapezio;
import br.sp.senai.jandira.calcular_figuras.model.Triangulo;
import br.sp.senai.jandira.calcular_figuras.model.Circuferencia;

public class Main {

	public static void main(String[] args) {
		
		Menu.criarMenu();
		
		Trapezio tra1 = new Trapezio();
		tra1.setBaseMenor(2);
		tra1.setBaseMaior(3);
		tra1.setAltura(4);
		tra1.exibirResultado();
		
		Quadrado qua1 = new Quadrado ();
		qua1.setLado(4);
		qua1.exibirResultado();
		
		Triangulo tri1 = new Triangulo ();
		tri1.setBase(3);
		tri1.setAltura(4);
		tri1.exibirResultado();
		
		Retangulo ret1 = new Retangulo ();
		ret1.setBase(10);
		ret1.setAltura(5);
		ret1.exibirResultado();
		
		Circuferencia cir1 = new Circuferencia ();
		cir1.setRaio(5);
		cir1.exibirResultado();
		
	}

}
