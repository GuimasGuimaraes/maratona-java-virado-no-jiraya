import java.util.Scanner;

public class DiasSemanais {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Receba os dados do usuário e imprima o dia da semana correspondente");
        System.out.println("Digite um número de '1' a '7' para saber o dia da semana!");
        int diaDaSemana = scan.nextInt();

        if (diaDaSemana == 1) {
            System.out.println("Hoje é Segunda feira!");
        }else if (diaDaSemana == 2) {
            System.out.println("Hoje é Terca feira!");
        }else if (diaDaSemana == 3) {
            System.out.println("Hoje é Quarta feira!");
        }else if (diaDaSemana == 4) {
            System.out.println("Hoje é Quinta feira!");
        }else if (diaDaSemana == 5) {
            System.out.println("Hoje é Sexta Feira");
        }else if (diaDaSemana == 6 ) {
            System.out.println("Hoje é Sábado");
        }else if (diaDaSemana == 7){
            System.out.println("Hoje é Domingo");
        }else {
            System.out.println("Dia inválido, digite um número de 1 a 7");
        }





    }
}
