package Collections.List.EmployeeManagement;

public class EmployeeTest {

    public static void main(String[] args){

        EmployeeDB db=new EmployeeDB();

        db.addEmployee(new Employee(101,"Akhila","akhila@gmail.com","Female",50000));
        db.addEmployee(new Employee(102,"Rahul","rahul@gmail.com","Male",45000));
        db.addEmployee(new Employee(103,"Priya","priya@gmail.com","Female",55000));

        System.out.println("Employee Details");
        db.displayAll();

        System.out.println(db.showPaySlip(102));

        db.deleteEmployee(102);

        System.out.println("\nAfter Deleting Employee 102");

        db.displayAll();
    }
}