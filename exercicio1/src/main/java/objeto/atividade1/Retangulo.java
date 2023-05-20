/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objeto.atividade1;

/**
 *
 * @author Windows
 */
public class Retangulo extends Shape{
    public double base;
    public double altura;

    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public void calcularArea(){
        double area= base * altura;
        System.out.println("Area do retangulo: "+area);
    }

    public void calcularPerimetro(){
        double perimetro=(base + altura)*2;
    }
}
