package academy.devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula04Login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final String login = "guilherme";
        final String password = "guimaraes";

        boolean autenticacaoUsuario = true;
        while (true) {
            System.out.println("Digite seu login");
            String loginDigitado = scan.nextLine();
            System.out.println("Digite seu password");
            String passwordDigitado = scan.nextLine();

            if (login.equals(loginDigitado) && password.equals(passwordDigitado)) {
                System.out.println("Acesso Concedido");
                break;
            }
            System.out.println("Acesso negado!");

        }



    }
}
