package academy.devdojo.arrays.unidimensional;

import java.util.Scanner;

public class Aula02ArraysComFor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] notas = new double[5];

        notas[0] = 7.5;
        notas[1] = 23;
        notas[2] = 24;
        notas[3] = 14;
        notas[4] = 14;

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota " + (i + 1));
            notas[i] = scan.nextDouble();
        }
        double media = 0;

        for (int i = 0; i < notas.length; i++) {
            media = media + notas[i];
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }
        media = media / notas.length;
        System.out.println("A media é de: " + media);
    }
}
