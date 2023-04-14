package academy.devdojo.lacosderepeticao.fors;
import java.util.Scanner;
public class Aula02Exercicio02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor que deseja saber a tabuada");
        int valor = scan.nextInt();

        for (int i = 1; i <= 10 ; i++) {
            System.out.println( valor + " X  " + valor * i);

        }
    }
}
