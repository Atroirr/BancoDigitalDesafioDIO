package org.example;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public String informacoes() {
        return "Informações da Conta :\n" +
                "Tipo da conta= Poupanca \n"+
                "Agencia=" + agencia + "\n"+
                "Numero=" + numero + "\n" +
                "Saldo=" + saldo + "\n" +
                "Cliente=" + cliente + "\n";
    }
}