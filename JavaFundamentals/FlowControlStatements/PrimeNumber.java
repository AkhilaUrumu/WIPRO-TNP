package JavaFundamentals.FlowControlStatements;

public class PrimeNumber {
    public static void main(String args[]) {

        int num=Integer.parseInt(args[0]);
        boolean prime=true;

        if(num<=1){
            prime=false;
        }
        else{
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num%i==0){
                    prime=false;
                    break;
                }
            }
        }

        if(prime){
            System.out.println(num+" is a prime number");
        }
        else{
            System.out.println(num+" is not a prime number");
        }
    }
}