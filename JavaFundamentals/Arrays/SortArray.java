package JavaFundamentals.Arrays;
import java.util.Arrays;
public class SortArray {
    public static void main(String[] args){
        int[] arr={10,45,2,78,34,99,5};
        Arrays.sort(arr);
        System.out.println("Sorted Array:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
