/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objeto.atividade1;

/**
 *
 * @author Windows
 */
public class Circulo extends Shape{
    public double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    public void calcularArea(){
        double area=(22*raio*raio)/7;
        System.out.println("Area do circulo:"+area);
    }
}
