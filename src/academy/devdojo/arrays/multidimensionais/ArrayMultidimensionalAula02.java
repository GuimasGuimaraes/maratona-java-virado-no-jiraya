package academy.devdojo.arrays.multidimensionais;

public class ArrayMultidimensionalAula02 {
    public static void main(String[] args) {
        int[][] arrayMulti = new int[2][3];
        arrayMulti[0][0] = 22;
        arrayMulti[0][1] = 11;
        arrayMulti[0][2] = 54;
        arrayMulti[1][0] = 14;
        arrayMulti[1][1] = 28;
        arrayMulti[1][2] = 28;

        for (int i = 0; i < arrayMulti.length ; i++) {
            for (int j = 0; j < arrayMulti[i].length; j++) {
                System.out.println("["+i+"]["+j+"] = "+arrayMulti[i][j]);

            }
        }


    }
}
