package academy.devdojo.estruturascondicionais.ifelse;

public class AlistamentoMilitar {
    public static void main(String[] args) {
        char sexo = 'F';
        int idade = 18;

        if ((sexo == 'M' || sexo == 'F') && idade < 18) {
            System.out.println("Você não poderá se alistar");
        }else if (sexo == 'M' && idade >= 18) {
            System.out.println("Alistamento obrigatório");
        }else if (sexo == 'F' && idade >= 18) {
            System.out.println("Você deseja se alistar?");
        }

    }
}
