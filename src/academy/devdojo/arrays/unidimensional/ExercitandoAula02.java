package academy.devdojo.arrays.unidimensional;

public class ExercitandoAula02 {
    public static void main(String[] args) {

        // valores padrões de tipos primitivos; byte, short, int ,long, float, doble = valor 0;
        // boolean false;
        // String null;
        double[] notas = new double[6];
        notas[0] = 21;
        notas[1] = 1;
        notas[2] = 13;
        notas[3] = 51;
        notas[4] = 16;
        notas[5] = 11;

        for (int i = 0; i < notas.length ; i++) {
            System.out.println(notas[i]);
        }

    }
}
