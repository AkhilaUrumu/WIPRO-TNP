package JavaFundamentals.Arrays;

public class Sum67 {
    public static void main(String args[]){
        int arr[]={1,2,2,6,99,99,7,3,4};
        int sum=0;
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==6){
                flag=true;
            }
            if(!flag){
                sum=sum+arr[i];
            }
            if(arr[i]==7){
                flag=false;
            }
        }
        System.out.println("Sum = "+sum);
    }
}
