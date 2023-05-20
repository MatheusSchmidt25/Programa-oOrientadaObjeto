/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package objeto.atividade2;

/**
 *
 * @author Windows
 */
public class Atividade2 {

    public static void main(String[] args) {
        Conta conta = new Conta(2000,"Matheus");
        conta.depositar();
        conta.sacar();
        conta.verSaldo();
    }
}
