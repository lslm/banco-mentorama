package org.example.models.transacoes;

public class Saque implements Transacao {
    private Tipo tipo;
    private double valor;

    public Saque(double valor) {
        tipo = Tipo.DEBITO;
        this.valor = valor;
    }

    @Override
    public double getValor() {
        return valor * -1;
    }

    @Override
    public String toString() {
        return "Saque{" +
                "tipo=" + tipo +
                ", valor=" + valor +
                '}';
    }
}
