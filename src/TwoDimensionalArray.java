import java.lang.reflect.Array;
import java.util.Arrays;

public class TwoDimensionalArray {

    int[][] arr = null;

    public TwoDimensionalArray(int a, int b){
        this.arr = new int[a][b];
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                arr[i][j] = Integer.MIN_VALUE;
            }
        }
    }

    public void insert(int row, int col, int valueToBeInserted){
        if(arr[row][col] == Integer.MIN_VALUE){
            arr[row][col] = valueToBeInserted;
        } else {
            System.out.println("The cell is already occupied");
        }
    }

    public void traverse() {
        for (int[] ints : arr) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.println(ints[j]);
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }

    public void searchArray(int n){
        for(int[] ints : arr){
            for(int j=0; j<arr[0].length;j++){
                if(ints[j] == n){
                    System.out.println("Value is present in the Array at: "+j+"th Column");
                    return;
                }
            }
        }
        System.out.println("Better luck Next Time.!!");
    }
}
