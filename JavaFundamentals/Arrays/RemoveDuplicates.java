package JavaFundamentals.Arrays;
import java.util.Arrays;
public class RemoveDuplicates {
    public static void main(String args[]){
        int arr[]={12,34,12,45,67,89};
         Arrays.sort(arr);
        int i=0;
        for(int j=i+1;j<arr.length;j++){
            if(arr[j]!=arr[i]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        for(int k=0;k<=i;k++){
            System.out.print(arr[k]+" ");
        }
    }
}