package academy.devdojo.estruturascondicionais.ifelse;

import java.util.Scanner;

public class ExerciciosControleFluxo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu salário: ");
        double salario;
        salario = scan.nextDouble();

        if (salario > 4500.50) {
            System.out.println("Sálario maior que 4500, imprimindo 30% do valor: " + (salario * 0.3));
        }else {
            System.out.println("Imprimindo 15% do valor: " + (salario * 0.15));
        }

    }
}
