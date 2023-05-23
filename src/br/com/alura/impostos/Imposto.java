package br.com.alura.impostos;

import br.com.alura.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {
  BigDecimal calcular(Orcamento orcamento);

}
