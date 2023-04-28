package academy.devdojo.arrays.multidimensionais;

public class ArrayMultidimensionalAula03 {
    public static void main(String[] args) {
        int [][] arrayInt = new int[2][];

        arrayInt[0] = new int[2];
        arrayInt[1] = new int[10];

        int[][] arrayInt02 = {{ 0,0},{1,2,3},{4,5,6,8,7,6,1} };


        for (int[] arrBase :arrayInt02 ) {
            for(int num: arrBase){
                System.out.println(num);
            }

        }




    }
}
