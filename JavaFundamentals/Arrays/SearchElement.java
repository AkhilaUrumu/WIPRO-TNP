package JavaFundamentals.Arrays;

public class SearchElement {
    public static void main(String[] args){
        int[] arr={10,20,30,40,50};
        int search=30;
        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==search){
                index=i;
                break;
            }
        }
        if(index!=-1){
            System.out.println(search+" found at index "+index);
        }
        else{
            System.out.println(search+" not found");
        }
    }
}
    

