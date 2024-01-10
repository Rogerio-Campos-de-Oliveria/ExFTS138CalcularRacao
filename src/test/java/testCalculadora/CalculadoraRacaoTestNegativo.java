package testCalculadora;

import br.com.iterasys.CalculadoraRacao;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculadoraRacaoTestNegativo {
    
    @Test
    public void testCacularRacaoNegativo_P (){
        // Configura

        double peso = 5.5;
        double resultadoEsperado = 55;

        // Excecuta
        double resultadoAtual = CalculadoraRacao.calcularRacao('X', peso);

        // Valida
        Assert.assertEquals(resultadoAtual, resultadoEsperado);

    }


    @Test
    public void testCacularRacaoNegativo_M (){
        // Configura

        double peso = 4.5;
        double resultadoEsperado = 10;

        // Excecuta
        double resultadoAtual = CalculadoraRacao.calcularRacao('M', peso);


        // Valida
        Assert.assertEquals(resultadoAtual, resultadoEsperado);

    }

    @Test
    public void testCacularRacaoNegativo_G (){
        // Configura

        double peso = 10.5;
        double resultadoEsperado = 31005;

        // Excecuta
        double resultadoAtual = CalculadoraRacao.calcularRacao('G', peso);


        // Valida
        Assert.assertEquals(resultadoAtual, resultadoEsperado);

    }

}
