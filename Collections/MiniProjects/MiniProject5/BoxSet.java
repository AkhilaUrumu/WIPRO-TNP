package Collections.MiniProjects.MiniProject5;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class BoxSet {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Box> boxes = new TreeSet<>();

        System.out.print("Enter the number of Boxes: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("\nEnter Box " + i + " Details");

            System.out.print("Enter Length: ");
            double length = sc.nextDouble();

            System.out.print("Enter Width: ");
            double width = sc.nextDouble();

            System.out.print("Enter Height: ");
            double height = sc.nextDouble();

            boxes.add(new Box(length, width, height));
        }

        System.out.println("\nUnique Boxes in the Set are");

        for (Box b : boxes) {

            System.out.printf(
                    "Length=%.1f Width=%.1f Height=%.1f Volume=%.2f%n",
                    b.getLength(),
                    b.getWidth(),
                    b.getHeight(),
                    b.getVolume());
        }

        sc.close();
    }
}