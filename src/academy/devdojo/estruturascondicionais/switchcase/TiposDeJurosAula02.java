package academy.devdojo.estruturascondicionais.switchcase;

import java.util.Scanner;

public class TiposDeJurosAula02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Para saber a porcentagem de juros da sua conta, informe a opção correspondente: 1 - CONTA POUPANÇA - 2 CONTA CORRENTE - 3 CONTA INVESTIMENTO");
        int tipoDaConta = scan.nextInt();

        switch (tipoDaConta){
            case 1:
                System.out.println("Conta Poupança, juros de 0.05%");
                break;
            case 2:
                System.out.println("Conta Corrente, juros de 0.02%");
                break;
            case 3:
                System.out.println("Conta Investimento, juros de 0.1%");
                break;
            default:
                System.out.println("COD VERIFICADOR INVÁLIDO");
        }
    }
}
