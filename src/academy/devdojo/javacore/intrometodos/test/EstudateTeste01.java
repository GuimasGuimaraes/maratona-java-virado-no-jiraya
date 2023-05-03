package academy.devdojo.javacore.intrometodos.test;

import academy.devdojo.javacore.intrometodos.dominio.Estudante;
import academy.devdojo.javacore.intrometodos.dominio.ImpressoraEstudante;

public class EstudateTeste01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Guilherme";
        estudante01.idade = 25;
        estudante01.sexo = 'M';
        estudante02.nome = "Gustavo";
        estudante02.idade = 25;
        estudante02.sexo = 'M';

        impressora.imprime(estudante02);






    }
}
