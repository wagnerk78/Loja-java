package br.com.alura.descontos;

import br.com.alura.orcamento.Orcamento;

import java.math.BigDecimal;

public class MaiorQueQuinhentos extends Desconto {

    public MaiorQueQuinhentos(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento) {
            return orcamento.getValor().multiply(new BigDecimal("0.05"));

    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
    }
}
