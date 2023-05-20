/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package objeto.atividade4;

/**
 *
 * @author Windows
 */
public class Atividade4 {

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();
        cachorro.mover();
        
        Gato gato = new Gato();
        gato.emitirSom();
        gato.mover();
        
        Passarinho passaro = new Passarinho();
        passaro.emitirSom();
        passaro.mover();
    }
}
