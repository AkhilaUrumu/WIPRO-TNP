package Abstraction.MiniProject2.com.milel.main;

import Abstraction.MiniProject2.com.milel.bean.Student;
import Abstraction.MiniProject2.com.milel.service.StudentService;

public class StudentMain{

    public static void main(String[]args){

        StudentService service=new StudentService();

        Student s1=new Student("Akhila",new int[]{85,90,80});
        Student s2=new Student("Rahul",new int[]{65,70,60});
        Student s3=new Student("Ravi",new int[]{45,50,40});
        Student s4=new Student("Kiran",new int[]{30,35,25});
        Student s5=new Student(null,new int[]{90,90,90});
        Student s6=new Student("Sita",null);
        Student s7=null;

        Student[]students={s1,s2,s3,s4,s5,s6,s7};

        for(Student s:students){

            System.out.println("-----------------------------");

            if(s!=null){
                System.out.println("Name : "+s.getName());
            }

            System.out.println("Result : "+service.getGrade(s));
        }
    }
}