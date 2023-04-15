package academy.devdojo.arrays.unidimensional;

public class Aula01IntroArrays {
    public static void main(String[] args) {
        double[] notas = new double[10];

        notas[0] = 7.5;
        notas[1] = 23;
        notas[2] = 24;
        notas[3] = 14;
        notas[4] = 14;
        notas[5] = 14;
        notas[6] = 14;
        notas[7] = 14;


        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }


    }
}
