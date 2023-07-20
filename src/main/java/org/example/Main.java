package org.example;

import org.example.models.Conta;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.depositar(100);
        conta.sacar(50);
        conta.depositar(20);

        System.out.println(conta.getSaldo());
        System.out.println(conta.getTransacoes());
    }
}