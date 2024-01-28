package testCalculadora;

import br.com.iterasys.CalculadoraRacao;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;



public class CalculadoraRacaoTestPositivo {


    @Test
    public void testcacularRacaoPositivo_P (){
        // Configura

        double peso = 5.5;
        double resultadoEsperado = 55;

        // Excecuta
        double resultadoAtual = CalculadoraRacao.calcularRacao('P', peso);

        // Valida
        Assert.assertEquals(resultadoAtual, resultadoEsperado);

    }


    @Test
    public void testcacularRacaoPositivo_M (){
        // Configura

        double peso = 4.5;
        double resultadoEsperado = 135;

        // Excecuta
        double resultadoAtual = CalculadoraRacao.calcularRacao('G', peso);


        // Valida
        Assert.assertEquals(resultadoAtual, resultadoEsperado);

    }

    @Test
    public void testcacularRacaoPositivo_G (){
        // Configura

        double peso = 10.5;
        double resultadoEsperado = 315;

        // Excecuta
        double resultadoAtual = CalculadoraRacao.calcularRacao('G', peso);


        // Valida
        Assert.assertEquals(resultadoAtual, resultadoEsperado);

    }


        @DataProvider(name = "dadosCSV") // Feito com ajuda do chatGBT
        public Object[][] lerDadosCSV() throws IOException {
            String caminhoArquivo = "C:\\Users\\pirul\\IdeaProjects\\CalcularRacao\\Dados Teste\\Dados.csv";
            BufferedReader reader = new BufferedReader(new FileReader(caminhoArquivo));

            List<Object[]> linhas = new ArrayList<>();
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split(",");
                char tamanho = dados[0].charAt(0);
                double peso = Double.parseDouble(dados[1]);
                double resultadoEsperado = Double.parseDouble(dados[2]);
                linhas.add(new Object[]{tamanho, peso, resultadoEsperado});
            }

            reader.close();
            return linhas.toArray(new Object[0][]);
        }

        @Test(dataProvider = "dadosCSV")
        public void testePositivo(char tamanho, double peso, double resultadoEsperado) {
            double resultadoAtual = CalculadoraRacao.calcularRacao(tamanho, peso);

            // Verifica se o resultado é igual ao esperado
            Assert.assertEquals(resultadoAtual, resultadoEsperado);
        }


}


