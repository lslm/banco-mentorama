package org.example.models.transacoes;

public class Deposito implements Transacao {
    private Tipo tipo;
    private double valor;

    public Deposito(double valor) {
        tipo = Tipo.CREDITO;
        this.valor = valor;
    }

    @Override
    public double getValor() {
        return Math.abs(valor);
    }

    @Override
    public String toString() {
        return "Deposito{" +
                "tipo=" + tipo +
                ", valor=" + valor +
                '}';
    }
}
