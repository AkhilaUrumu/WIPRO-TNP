package JavaFundamentals.Arrays;

public class AsciiToCharacter {
    public static void main(String[] args){
        char[] arr={'A','B','C','D','E','F','G','H','I','J',
                    'K','L','M','N','O','P','Q','R','S','T',
                    'U','V','W','X','Y','Z'};
        for(int i=0;i<arr.length;i++){
            System.out.println((i+65)+"-"+arr[i]);
        }
    }
}
    
