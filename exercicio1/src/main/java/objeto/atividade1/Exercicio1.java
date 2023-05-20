/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package objeto.atividade1;

/**
 *
 * @author Windows
 */
public abstract class Exercicio1 {

    public static void main(String[] args) {
    
    Circulo circulo = new Circulo(10);
    circulo.calcularArea();
    Retangulo retangulo = new Retangulo(10,2);
    retangulo.calcularArea();
    Triangulo triangulo = new Triangulo(12,12);
    triangulo.calcularArea();

    }
}
