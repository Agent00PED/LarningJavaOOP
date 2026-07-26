import java.util.Arrays;

public class arr2d02 {
    public static void main(String[] args) {
        int size = 5;
        int[][] matrix = {  {1,0,0,0,0},
                            {2,6,0,0,0},
                            {3,7,10,0,0},
                            {4,8,11,12,0},
                            {5,9,12,13,14},
        };
        

        for (int[] numBox:matrix){
            System.out.println(Arrays.toString(numBox));
        }

        System.out.println(isTriangularMatrix(matrix));
    }
    static boolean isTriangularMatrix(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a[i].length; j++) {
                if (a[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
