import java.util.Arrays;

public class Main {
    //Main method
        public static void main(String[] args) {
            //declaring a multidimensional 2D array which is not initialized
        int[][] num = new int [2][3];
        num[0][0]= 1;
        //printing the multidimensional array
        System.out.println(Arrays.deepToString(num));
        //declaring and initializing a multidimensional array
        int [][] num2 = {{1,2,3},{4,5,6}};
        //printing the multidimensional array
        System.out.println(Arrays.deepToString(num2));
    }
}