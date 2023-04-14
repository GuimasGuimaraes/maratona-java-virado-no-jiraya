/*menor de 10 = nome participara da categ infantil
entre 11 e 15 nome cat juvenil
entre 16 e 19 nome cat pre-adulto
acima de 20 nome cat adulto
* */

import java.util.Scanner;

public class TorneioNatacao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Digite o seu nome");
        String nome = scan.next();

        System.out.println("Digite sua idade");
        int idade = scan.nextInt();


        if (idade <= 10) {
            System.out.println(nome + " Participará da categoria infantil pois tem " + idade + " anos");
        } else if (idade >= 11 && idade <= 15) {
            System.out.println(nome + " Participará da categoria juvenil pois tem " + idade + " anos");
        } else if (idade >= 16 && idade <= 19) {
            System.out.println(nome + " Participará da categoria pre-adulto pois tem " + idade + " anos");
        } else {
            System.out.println(nome + " Categoria Adulto pois tem " + idade + " anos");


        }


    }
}
