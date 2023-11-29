import java.util.Arrays;

public class arr2d {
    public static void main(String[] args) {
        int size = 5;
        int[][]matrix = new int[size][size];
        int num = 1;
        for (int i = 0; i<size ; i++){
            for (int j = 0; j<size ; j++){
                matrix[i][j] = num;
                num++;
            }
        }
        for (int[] numBox: matrix){
            System.out.println(Arrays.toString(numBox));
        }
           
    }
}
