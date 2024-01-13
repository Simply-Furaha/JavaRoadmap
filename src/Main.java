
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //declare an array of integers
        int Nums[]= new int[10];
        Nums[0] = 1;
         Nums[1] = 2;
            Nums[2] = 3;
                Nums[3] = 4;
                   Nums[4] = 5;
                     Nums[5] = 6;
                        Nums[6] = 7;
                            Nums[7] = 8;
       //print the array
        System.out.println(Arrays.toString(Nums));
        //Declare and initialize another array
        int Num2[]= {10,2,5,4,9,6,7,8,1,3};
        //Sort the array
        Arrays.sort(Num2);
        //print the array
        System.out.println(Arrays.toString(Num2));
        //print the length of the arrays
        System.out.println(Num2.length);
        System.out.println(Nums.length);
    }
}