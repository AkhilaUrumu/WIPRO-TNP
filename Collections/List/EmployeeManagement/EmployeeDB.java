package Collections.List.EmployeeManagement;

import java.util.ArrayList;

public class EmployeeDB {

    ArrayList<Employee> list=new ArrayList<>();

    public boolean addEmployee(Employee e){
        return list.add(e);
    }

    public boolean deleteEmployee(int empId){

        for(int i=0;i<list.size();i++){
            if(list.get(i).getEmpId()==empId){
                list.remove(i);
                return true;
            }
        }
        return false;
    }

    public String showPaySlip(int empId){

        for(Employee e:list){
            if(e.getEmpId()==empId){
                return "Pay Slip\nEmployee ID : "+empId+"\nSalary : "+e.getSalary();
            }
        }
        return "Employee not found";
    }

    public void displayAll(){

        for(Employee e:list){
            e.getEmployeeDetails();
        }
    }
}