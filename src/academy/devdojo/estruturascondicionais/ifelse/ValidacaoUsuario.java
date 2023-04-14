package academy.devdojo.estruturascondicionais.ifelse;

import java.util.Scanner;

public class ValidacaoUsuario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um nome: ");
        String nome = scan.next();

        if(nome.equals("") || nome.equalsIgnoreCase("admin") || nome.equalsIgnoreCase("administrador")) {
            System.out.println("Usuário Inválido");
        }else {
            System.out.println(nome + " castrado com sucesso");
        }

        System.out.println("Testando");

    }
}
