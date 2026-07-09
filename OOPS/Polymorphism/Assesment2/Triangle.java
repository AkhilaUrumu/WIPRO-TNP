package OOPS.Polymorphism.Assesment2;

public class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Triangle");
    }
    @Override
    public void erase() {
        System.out.println("Erasing Triangle");
    }
}