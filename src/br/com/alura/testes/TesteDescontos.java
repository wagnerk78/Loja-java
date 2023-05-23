package br.com.alura.testes;

import br.com.alura.descontos.CalculadoraDeDescontos;
import br.com.alura.impostos.CalculadoraImpostos;
import br.com.alura.impostos.ICMS;
import br.com.alura.impostos.ISS;
import br.com.alura.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteDescontos {

    public static void main(String[] args) {
        Orcamento primeiro = new Orcamento(new BigDecimal("700"), 4);
        Orcamento segundo = new Orcamento(new BigDecimal("300"), 6);
        Orcamento terceiro = new Orcamento(new BigDecimal("700"), 10);
        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();

        System.out.println(calculadora.calcular(primeiro));
        System.out.println(calculadora.calcular(segundo));
        System.out.println(calculadora.calcular(terceiro));

    }
}
