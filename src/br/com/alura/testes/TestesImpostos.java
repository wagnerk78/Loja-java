package br.com.alura.testes;

import br.com.alura.impostos.CalculadoraImpostos;
import br.com.alura.impostos.ICMS;
import br.com.alura.impostos.ISS;
import br.com.alura.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImpostos {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);

        CalculadoraImpostos calculadora = new CalculadoraImpostos();

        System.out.println(calculadora.calcular(orcamento, new ICMS()));
        System.out.println(calculadora.calcular(orcamento,new ISS() ));
    }
}
