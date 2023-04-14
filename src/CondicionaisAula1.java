import java.util.Scanner;

public class CondicionaisAula1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int idade;
        System.out.println("Digite sua idade");
        idade = scan.nextInt();

        if (idade < 18) {
            System.out.println("Você ainda não atingiu a maioridade");
        }else {
            System.out.println("Você já atingiu a maioridade");
        }



    }

}
