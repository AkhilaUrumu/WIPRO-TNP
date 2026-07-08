package JavaFundamentals.FlowControlStatements;

public class PalindromeNumber {
    public static void main(String args[]){
        int n=Integer.parseInt(args[0]);
        int pal=n;
        int rev=0;
        while(n>0){
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(pal==rev){
            System.out.println(pal + " is a palindrome");
        }else{
            System.out.println(pal + " is not a palindrome");
        }
    }
}
 

