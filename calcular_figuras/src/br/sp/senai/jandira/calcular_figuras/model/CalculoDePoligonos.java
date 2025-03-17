package br.sp.senai.jandira.calcular_figuras.model;

import java.util.Scanner;

public class CalculoDePoligonos {
    
    public static void calcularRetangulo() { 
        
        Retangulo retangulo  = new Retangulo();
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Altura do retangulo:");
        double altura = leitor.nextDouble();
                
        System.out.println("Base do retangulo:");
        double base = leitor.nextDouble(); 
        
        retangulo.setAltura(altura);
        retangulo.setBase(base);
        retangulo.exibirResultado();
        
        leitor.close();
    }

}
