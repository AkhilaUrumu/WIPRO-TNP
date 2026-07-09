package OOPS.Polymorphism.Assesment1;

public class FruitDemo {
     public static void main(String[] args) {
        Fruit f = new Fruit("Mango", "Sweet", "Large");
        Fruit a = new Apple();
        Fruit o = new Orange();
        f.eat();
        System.out.println();
        a.eat();
        System.out.println();
        o.eat();
    }
}