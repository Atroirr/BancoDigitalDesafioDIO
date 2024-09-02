package org.example;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public String informacoes() {
        return "Informações da Conta :\n" +
                "Tipo da conta= Corrente \n"+
                "Agencia=" + agencia + "\n"+
                "Numero=" + numero + "\n" +
                "Saldo=" + saldo + "\n" +
                "Cliente=" + cliente + "\n";
    }
}
