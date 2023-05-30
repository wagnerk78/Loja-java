package br.com.alura.descontos;

import br.com.alura.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {

    public BigDecimal calcular(Orcamento orcamento) {
        Desconto cadeiaDeDesconto = new MaiorQueQuinhentos(new CincoItens(new SemDesconto()));

    return cadeiaDeDesconto.calcular(orcamento);
    }

}
