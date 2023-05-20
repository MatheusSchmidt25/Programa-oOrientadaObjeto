/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objeto.atividade2;

/**
 *
 * @author Windows
 */
public class Conta {
    private double saldo;
    private String titular;

    public Conta(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    
    
    public void depositar(){
        saldo+=1000;
        System.out.println("Deposito de 1000 reais:"+saldo);
    }
    public void sacar(){
        saldo-=500;
        System.out.println("Sacar 500 reais: "+saldo);
    }
    public void verSaldo(){
        System.out.println("Saldo: "+saldo);
    }
}
