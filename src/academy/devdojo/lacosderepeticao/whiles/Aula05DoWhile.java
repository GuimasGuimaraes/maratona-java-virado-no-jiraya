package academy.devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula05DoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      int desejaContinuar = 1;
        do {
            System.out.println("Player 1 - Digite um numero entre 1 e 10");
            int num1 = scan.nextInt();
            System.out.println("Player 2 - Digite um numero entre 1 e 10");
            int num2 = scan.nextInt();
            System.out.println("Acertou: " + (num1 == num2));
            System.out.println("----------------------------------------------------");
            System.out.println("Deseja continuar jogando?");
            System.out.println("1 para sim");
            System.out.println("2 para Não");
            desejaContinuar = scan.nextInt();
      }while (desejaContinuar == 1);
    }
}
