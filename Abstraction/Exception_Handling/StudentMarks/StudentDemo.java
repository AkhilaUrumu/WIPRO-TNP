package Abstraction.Exception_Handling.StudentMarks;

import java.util.Scanner;

public class StudentDemo {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        try {

            for(int i=1;i<=2;i++) {

                System.out.println("Enter Student Name:");
                String name=sc.nextLine();

                int[] marks=new int[3];
                int sum=0;

                for(int j=0;j<3;j++) {

                    System.out.println("Enter Mark:");
                    marks[j]=Integer.parseInt(sc.nextLine());

                    if(marks[j]<0) {
                        throw new NegativeValuesException("Negative values are not allowed");
                    }

                    if(marks[j]>100) {
                        throw new OutOfRangeException("Values should be between 0 and 100");
                    }

                    sum+=marks[j];
                }

                Student s=new Student(name,marks);

                System.out.println("Average = "+(sum/3.0));
                System.out.println();
            }

        }
        catch(NumberFormatException e) {
            System.out.println("java.lang.NumberFormatException");
        }
        catch(NegativeValuesException e) {
            System.out.println(e.getMessage());
        }
        catch(OutOfRangeException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}