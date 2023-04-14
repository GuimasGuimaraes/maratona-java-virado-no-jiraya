package academy.devdojo.estruturascondicionais.ifelse;

import java.util.Scanner;

public class ImpostoDeRenda {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double salario;
        System.out.println("Digite um salário");
        salario = scan.nextDouble();


        if (salario < 1903) {
            System.out.println("Isento");
        } else if (salario > 1.903 && salario <= 2500) {
            System.out.println("Imposto de 3%");
        } else if (salario > 2500 && salario <= 3000) {
            System.out.println("Imposto de 5%");
        } else {
            System.out.println("Imposto de 25%");
        }
    }
}
