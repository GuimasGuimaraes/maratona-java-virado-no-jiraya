package academy.devdojo.javacore.intrometodos.test;

import academy.devdojo.javacore.intrometodos.dominio.Calculadora;

public class CalculadoraTeste03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.divideDoisNumeros(20, 2);
        System.out.println(resultado);

    }
}
