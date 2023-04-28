package academy.devdojo.javacore.introducaoclasses.test;

import academy.devdojo.javacore.introducaoclasses.dominio.Carro;

public class Carrotest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.ano = 2023;
        carro1.nome = "Lamborguini";
        carro1.modelo = "Turbo";

        carro2.ano = 1997;
        carro2.nome = "Mustang";
        carro2.modelo = "V8";

        System.out.println(carro1.nome + "-" + carro1.ano + "-" + carro1.modelo);
        System.out.println(carro2.nome + "-" + carro2.ano + "-" + carro2.modelo);

    }
}
