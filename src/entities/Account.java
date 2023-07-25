package entities;

public class Account {

    public int conta;
    public String nome;
    public double valor;
    public double deposito;
    public double saque;

    public Account(int conta, String nome, double valor) {

        this.conta = conta;
        this.nome = nome;
        this.valor = valor;
    }

    public double deposito() {

        return this.deposito = this.valor + this.deposito;
    }

    public double saque() {
        if (this.saque > this.valor) {
            System.out.println("Saldo insuficiente!");
            return -100;
        } else {
            return  this.deposito - this.saque - 5.00;
        }
    }

}
