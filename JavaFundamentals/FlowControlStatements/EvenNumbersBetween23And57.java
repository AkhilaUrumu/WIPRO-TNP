package JavaFundamentals.FlowControlStatements;

public class EvenNumbersBetween23And57 {
    public static void main(String args[]) {
        for (int i=23;i<=57;i++){
            if (i%2==0)
                System.out.print(i + " ");
        }
    }
}