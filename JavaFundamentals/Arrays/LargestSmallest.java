package JavaFundamentals.Arrays;

import java.util.Arrays;

public class LargestSmallest {
    public static void main(String[] args){
        int[] arr={10,45,2,78,34,99,5};
        Arrays.sort(arr);
        System.out.println("Smallest = "+arr[0]+","+arr[1]);
        System.out.println("Largest = "+arr[arr.length-2]+","+arr[arr.length-1]);
    }
}
    

