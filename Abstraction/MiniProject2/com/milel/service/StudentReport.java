package Abstraction.MiniProject2.com.milel.service;

import Abstraction.MiniProject2.com.milel.bean.Student;
import Abstraction.MiniProject2.com.milel.exception.NullMarksArrayException;
import Abstraction.MiniProject2.com.milel.exception.NullNameException;
import Abstraction.MiniProject2.com.milel.exception.NullStudentObjectException;

public class StudentReport{

    public String validate(Student student)throws NullStudentObjectException,NullNameException,NullMarksArrayException{

        if(student==null){
            throw new NullStudentObjectException("Student object is null");
        }

        if(student.getName()==null){
            throw new NullNameException("Student name is null");
        }

        if(student.getMarks()==null){
            throw new NullMarksArrayException("Marks array is null");
        }

        return "VALID";
    }

    public String findGrades(Student student){

        int[]marks=student.getMarks();

        int sum=0;

        for(int i=0;i<marks.length;i++){
            sum+=marks[i];
        }

        double avg=sum/marks.length;

        if(avg>=80){
            return "A";
        }else if(avg>=60){
            return "B";
        }else if(avg>=40){
            return "C";
        }else{
            return "F";
        }
    }
}