package Collections.List.Vector;

public class Employee {

    private int empId;
    private String empName;
    private double salary;

    public Employee(int empId,String empName,double salary){
        this.empId=empId;
        this.empName=empName;
        this.salary=salary;
    }

    public String toString(){
        return "Employee ID : "+empId+
               "\nEmployee Name : "+empName+
               "\nSalary : "+salary+"\n";
    }
}