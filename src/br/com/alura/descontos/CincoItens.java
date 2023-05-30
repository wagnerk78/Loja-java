package br.com.alura.descontos;

import br.com.alura.orcamento.Orcamento;

import java.math.BigDecimal;

public class CincoItens extends  Desconto {

    public CincoItens(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.10"));
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getQuantidadeItens() > 5;
    }
}