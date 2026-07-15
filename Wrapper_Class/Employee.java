package Wrapper_Class;

public class Employee implements Cloneable {

    int empId;
    String name;
    double salary;

    Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    void display() {
        System.out.println("Employee ID : " + empId);
        System.out.println("Employee Name : " + name);
        System.out.println("Salary : " + salary);
    }

    public static void main(String[] args) throws CloneNotSupportedException {

        Employee e1 = new Employee(101, "Akhila", 50000);

        // Clone the object
        Employee e2 = (Employee) e1.clone();

        // Modify original object
        e1.empId = 102;
        e1.name = "Rahul";
        e1.salary = 60000;

        System.out.println("Original Employee");
        e1.display();

        System.out.println();

        System.out.println("Cloned Employee");
        e2.display();
    }
}