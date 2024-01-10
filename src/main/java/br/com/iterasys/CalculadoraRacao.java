/* 1- Teste de Unidade
        1.1 - Crie a funcionalidade calcular_racao_cao que receba o porte do cachorro como P, M ou G, e o peso em kg.
        Multiplique o peso por 10g para P, por 20g para M e por 30g para G, retornando a quantidade de ração em gramas.
        A funcionalidade não deve aceitar outras letras para porte ou valores menores ou iguais a zero, ou maiores
        que 100kg para o peso do animal.
        1.2 - Crie pelo menos um teste positivo e outro negativo para essa
        1.3 - Modifique o teste negativo para que leia valores de uma lista
        1.4 - Modifique o teste positivo para que leia um arquivo CSV */

package br.com.iterasys;


public class CalculadoraRacao {

    public static int calcularRacao(char tamanho, double peso) {
        if (tamanho == 'P'){
            if (peso > 0 && peso <= 100) {
                return (int) (peso * 10);

            } else {
                throw new IllegalArgumentException("Peso invalido para o tamanho 'P'");
            }
        } else if (tamanho == 'M') {
            if (peso > 0 && peso <= 100) {
                return (int) (peso * 20);
            } else {
                throw new IllegalArgumentException("Peso invalido para o tamanho 'M'");
            }
        } else if (tamanho == 'G') {
            if (peso > 0 && peso <= 100) {
                return (int) (peso * 30);
            } else {
                throw new IllegalArgumentException("Peso invalido para o tamanho 'G'");
            }
        } else {
            throw new IllegalArgumentException("Tamanho invalido");
        }

    }

}


