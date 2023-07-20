package org.example.models;

import org.example.models.transacoes.Deposito;
import org.example.models.transacoes.Saque;
import org.example.models.transacoes.Transacao;

import java.util.HashSet;
import java.util.Set;

public class Conta {
    private String numero;
    private double saldo;
    private Set<Transacao> transacoes;

    public Conta() {
        transacoes = new HashSet<>();
    }

    public double depositar(double valor) {
        Deposito deposito = new Deposito(valor);
        transacoes.add(deposito);
        saldo = getUpdatedSaldo();
        return saldo;
    }

    public double sacar(double valor) {
        Saque saque = new Saque(valor);
        transacoes.add(saque);
        saldo = getUpdatedSaldo();
        return saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getUpdatedSaldo() {
        return transacoes.stream().mapToDouble(Transacao::getValor).sum();
    }

    public Set<Transacao> getTransacoes() {
        return transacoes;
    }
}
