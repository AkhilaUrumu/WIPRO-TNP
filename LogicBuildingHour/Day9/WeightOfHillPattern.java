package LogicBuildingHour.Day9;

import java.util.Scanner;

public class WeightOfHillPattern {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter height:");
        int n=sc.nextInt();

        int weight=0;

        for(int i=1;i<=n;i++) {
            weight=weight+i*i;
        }

        System.out.println("Weight="+weight);
    }
}