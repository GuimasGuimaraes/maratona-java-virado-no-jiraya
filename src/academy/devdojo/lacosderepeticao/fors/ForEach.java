package academy.devdojo.lacosderepeticao.fors;

import java.util.Random;

public class ForEach {
    public static void main(String[] args) {
        Random random = new Random();
        int[] notas = new int[10];

        for (int i = 0; i < notas.length; i++) {
            notas[i] = random.nextInt(65);
            System.out.println(i);
        }

        System.out.println("---------------------- Usando o for each ----------------------");

        for (int nota : notas) {
            System.out.println(nota);
        }

        // exemplo 02


    }
}
