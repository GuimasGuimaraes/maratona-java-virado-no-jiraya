package academy.devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula03Menu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int option = 0;
        while (option != 3) {
            System.out.println("Digite a opção desejada");
            System.out.println("1. Calcular imposto");
            System.out.println("2. Depositar salário");
            System.out.println("3. Sair");

            option = scan.nextInt();

            switch (option) {
                case 1:
                    System.out.println("154%");
                    break;
                case 2:
                    System.out.println("Salário depositado com sucesso! Valor atual: R$103547.12 Reais");
                    break;
                case 3:
                    System.out.println("Até breve!");
                    break;
                default:
                    System.out.println("Digite o numero novamente");
            }

        }
        System.out.println("Processo Finalizado!");
    }
}
