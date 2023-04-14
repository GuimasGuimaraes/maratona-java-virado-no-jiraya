package academy.devdojo.variaveis;

import java.util.Scanner;

public class ReceberDadosTeclado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String participante;
        System.out.println("Digite o nome do participante: ");
        participante = scanner.nextLine();

        System.out.println("O nome do participante é: " + participante);
    }

    public static class CalculadoraImposto {
        public static void main(String[] args) {
    //        Scanner scan = new Scanner(System.in);
    //        float salario = 2500.00F;
    //
    //        System.out.println("Digite uma idade: ");
    //        float porcentagem;
    //        porcentagem = scan.nextFloat();
    //
    //        porcentagem = (salario / 100) * porcentagem;
    //
    //        System.out.println(salario);

            char caractere = 65;

            System.out.println(caractere);

            char masculino = 'M';
            char feminino = 'F';
            String nome = "Aqui você pode colocar uma frase bem grande!";
            System.out.println(nome);
            System.out.println(""+masculino + feminino);

            boolean condicao = false;
            System.out.println(condicao);



        }
    }
}
