package br.sp.senai.jandira.calcular_figuras.model;

public class Retangulo {
    private double base;
    private double altura;
    

    public void setAltura(double altura) { 
        this.altura = altura;
    }
    

    public double getAltura() { 
        return altura;
    }
    

    public void setBase(double base) { 
        this.base = base;
    }
    

    public double getBase() { 
        return base;
    }
    

    public double calcularAreaRetangulo(){
        double area = base * altura;  
        return area;
    }


    public double calcularPerimetroRetangulo() { 
        double perimetro = (base * 2) + (altura * 2);
        return perimetro;
    }
    

    public void exibirResultado () {
        System.out.println("========");
        System.out.println("Área do Retângulo: " + calcularAreaRetangulo());
        System.out.println("Perímetro do Retângulo: " + calcularPerimetroRetangulo());
        System.out.println("-----------");
    }
}
