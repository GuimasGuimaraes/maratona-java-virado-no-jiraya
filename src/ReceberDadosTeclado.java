import java.util.Scanner;

public class ReceberDadosTeclado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String participante;
        System.out.println("Digite o nome do participante: ");
        participante = scanner.nextLine();

        System.out.println("O nome do participante é: " + participante);
    }
}
