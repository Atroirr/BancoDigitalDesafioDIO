package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cliente lucas = new Cliente();
        lucas.setNome("Lucas");

        Conta cc = new ContaCorrente(lucas);
        Conta poupanca = new ContaPoupanca(lucas);

        cc.depositar(100);
        cc.transferir(poupanca, 100);

        System.out.println(cc.informacoes());
        System.out.println(poupanca.informacoes() );
        }
    }