package JavaFundamentals.Arrays;

public class Without10 {
    public static void main(String args[]){
        int arr[]={1,10,10,2};
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=10){
                arr[index]=arr[i];
                index++;
            }
        }
        while(index<arr.length){
            arr[index]=0;
            index++;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
