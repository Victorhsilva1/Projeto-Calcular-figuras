package br.sp.senai.jandira.calculadora.ui;

import java.util.Scanner;

public class Menu {
    public static void criarMenu() {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("-------------");
        System.out.println("CALCULADORA TABUADA");
        System.out.println("-------------");
        System.out.print("Qual é o multiplicando?");
        System.out.print("Qual é o mínimo multiplicador?");
        System.out.print("Qual é o máximo multiplicador?");
        
        int opcao = leitor.nextInt();
        
    }
}
        