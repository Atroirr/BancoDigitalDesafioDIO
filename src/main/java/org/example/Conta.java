package org.example;

public abstract class Conta implements InterfaceConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void transferir(Conta destino, double valor) {
        sacar(valor);
        destino.depositar(valor);
    }


    public String informacoes() {
        return "Informações da Conta:\n" +
                "Agencia=" + agencia + "\n"+
                "Numero=" + numero + "\n" +
                "Saldo=" + saldo + "\n" +
                "Cliente=" + cliente + "\n";
    }
}
