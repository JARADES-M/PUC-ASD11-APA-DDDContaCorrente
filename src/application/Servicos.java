package application;

import domain.entities.ContaCorrente;
import domain.valueObjects.Deposito;
import domain.valueObjects.Saque;
import domain.valueObjects.Transferencia;
import infrastructure.Persistencia;

import java.math.BigDecimal;

public class Servicos {

    Persistencia persistencia = new Persistencia();

    public void sacar (ContaCorrente contaCorrente, Saque saque) {

    }

    public void depositar (ContaCorrente contaCorrente, Deposito deposito) {

    }

    public void transferirParaMesmoBanco(ContaCorrente contaCorrente_de, ContaCorrente contaCorrente_para, BigDecimal valor) {

        Transferencia transferencia = new Transferencia();// valor

        contaCorrente_de.transferirParaMesmoBanco(contaCorrente_para, transferencia);

        try {

            persistencia.salvarContaCorrente(contaCorrente_de);

            persistencia.salvarContaCorrente(contaCorrente_para);

        } catch (Exception e) {
            //
            // rollback
        }

    }

}
