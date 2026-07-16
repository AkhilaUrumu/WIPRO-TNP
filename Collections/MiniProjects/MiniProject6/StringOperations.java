package Collections.MiniProjects.MiniProject6;

import java.util.ArrayList;
import java.util.Scanner;

public class StringOperations {

    public static ArrayList<String> performOperations(String s1, String s2) {

        ArrayList<String> result = new ArrayList<>();

        // 1. Replace alternate characters of S1 with S2
        StringBuilder op1 = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            if (i % 2 == 0)
                op1.append(s2);
            else
                op1.append(s1.charAt(i));
        }
        result.add(op1.toString());

        // 2. Replace last occurrence of S2 with reverse(S2)
        if (s1.indexOf(s2) != s1.lastIndexOf(s2)) {
            int last = s1.lastIndexOf(s2);
            String rev = new StringBuilder(s2).reverse().toString();
            result.add(s1.substring(0, last) + rev + s1.substring(last + s2.length()));
        } else {
            result.add(s1 + s2);
        }

        // 3. Delete first occurrence of S2
        if (s1.contains(s2)) {
            result.add(s1.replaceFirst(s2, ""));
        } else {
            result.add(s1);
        }

        // 4. Divide S2 into two halves
        int mid = (s2.length() + 1) / 2;
        String first = s2.substring(0, mid);
        String second = s2.substring(mid);
        result.add(first + s1 + second);

        // 5. Replace common characters with *
        StringBuilder op5 = new StringBuilder();
        for (char c : s1.toCharArray()) {
            if (s2.indexOf(c) >= 0)
                op5.append('*');
            else
                op5.append(c);
        }
        result.add(op5.toString());

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String S1: ");
        String s1 = sc.nextLine();

        System.out.print("Enter String S2: ");
        String s2 = sc.nextLine();

        ArrayList<String> output = performOperations(s1, s2);

        System.out.println("\nOutput:");
        for (int i = 0; i < output.size(); i++) {
            System.out.println((i + 1) + ". " + output.get(i));
        }

        sc.close();
    }
}