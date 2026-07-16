package Collections.MiniProjects.MiniProject3;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class CardCollection {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Card> cards = new ArrayList<>();
        LinkedHashSet<Character> symbols = new LinkedHashSet<>();

        while (symbols.size() < 4) {

            System.out.println("Enter a card :");

            System.out.print("Enter Symbol : ");
            char symbol = sc.next().charAt(0);

            System.out.print("Enter Number : ");
            int number = sc.nextInt();

            cards.add(new Card(symbol, number));
            symbols.add(symbol);
        }

        System.out.println("\nFour symbols gathered in " + cards.size() + " cards.");

        System.out.println("Cards in Set are :");

        TreeSet<Character> sorted = new TreeSet<>(symbols);

        for (char s : sorted) {

            for (Card c : cards) {

                if (c.getSymbol() == s) {
                    System.out.println(c.getSymbol() + " " + c.getNumber());
                    break;
                }
            }
        }

        sc.close();
    }
}