package academy.devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula02ExerciciosImpares {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um valor e será imprimido todos os numeros impares antecessores: ");
        int i = 0;
        int num = scan.nextInt();

        while (i < num) {
            if (i % 2 != 0) {
                System.out.println("Número Impar : " + i);
            }
            i++;
        }


    }
}
