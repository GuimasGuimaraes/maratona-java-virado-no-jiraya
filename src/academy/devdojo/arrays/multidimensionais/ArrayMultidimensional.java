package academy.devdojo.arrays.multidimensionais;

public class ArrayMultidimensional {
    public static void main(String[] args) {
        // primerio array representa os meses;
        // segundo array representa os dias do mês;

        int[][] dias = new int[3][3];
        dias[0][0] = 31;
        dias[0][1] = 25;
        dias[0][2] = 6;

        dias[1][0] = 12;
        dias[1][1] = 64;
        dias[1][2] = 32;

        dias[2][0] = 75;
        dias[2][1] = 98;
        dias[2][2] = 54;

        for (int i = 0; i < dias.length ; i++) {
            for (int j = 0; j < dias[i].length ; j++) {
                System.out.println(dias[i][j]);
            }
        }

        System.out.println("-----------------------------------------");
        for (int[] arrBase : dias) {
            for (int num : arrBase) {
                System.out.println(num);
            }
        }



    }

   }

