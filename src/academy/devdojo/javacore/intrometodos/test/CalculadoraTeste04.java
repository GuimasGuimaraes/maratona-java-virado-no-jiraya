package academy.devdojo.javacore.intrometodos.test;

import academy.devdojo.javacore.intrometodos.dominio.Calculadora;

public class CalculadoraTeste04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int num1 = 1;
        int num2 = 2;

        calculadora.alteraDoisNumeros(num1, num2);
        System.out.println("Dentro calc test 04");
        System.out.println(num1);
        System.out.println(num2);

    }
}
