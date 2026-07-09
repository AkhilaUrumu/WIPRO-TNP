package OOPS.Polymorphism.Assesment1;

public class Orange extends Fruit {
    Orange() {
        super("Orange", "Sour", "Medium");
    }
    @Override
    public void eat() {
        System.out.println("Fruit Name : " + name);
        System.out.println("Taste : " + taste);
    }
}