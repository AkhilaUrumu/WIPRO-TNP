package Collections.MiniProjects.MiniProject2;

import java.util.ArrayList;
import java.util.Scanner;

public class StringOperations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n1. Insert");
            System.out.println("2. Search");
            System.out.println("3. Delete");
            System.out.println("4. Display");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter the item to be inserted: ");
                    String item = sc.nextLine();
                    list.add(item);
                    System.out.println("Inserted successfully");
                    break;

                case 2:
                    System.out.print("Enter the item to search: ");
                    item = sc.nextLine();

                    if (list.contains(item))
                        System.out.println(item + " Found");
                    else
                        System.out.println(item + " Not Found");
                    break;

                case 3:
                    System.out.print("Enter the item to delete: ");
                    item = sc.nextLine();

                    if (list.remove(item))
                        System.out.println("Deleted Successfully");
                    else
                        System.out.println("Item Not Found");
                    break;

                case 4:
                    if (list.isEmpty()) {
                        System.out.println("List is Empty");
                    } else {
                        System.out.println("Items in the List:");
                        for (String s : list) {
                            System.out.println(s);
                        }
                    }
                    break;

                case 5:
                    System.out.println("Thank You");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 5);

        sc.close();
    }
}