package domain.entities;

import domain.valueObjects.*;

import java.math.BigDecimal;
import java.util.Objects;

public class ContaCorrente {

    private Titular titular;

    private BigDecimal saldo;

    private Agencia agencia;

    private String numero;


    public void depositar(Deposito deposito) {

    }

    public void sacar(Saque saque) {

    }

    public void transferirParaMesmoBanco(ContaCorrente contaCorrente, Transferencia transferencia) {

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContaCorrente that = (ContaCorrente) o;
        return agencia.equals(that.agencia) &&
                numero.equals(that.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agencia, numero);
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
