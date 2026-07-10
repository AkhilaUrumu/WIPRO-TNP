package Abstraction.MiniProject2.com.milel.service;

import Abstraction.MiniProject2.com.milel.bean.Student;
import Abstraction.MiniProject2.com.milel.exception.NullMarksArrayException;
import Abstraction.MiniProject2.com.milel.exception.NullNameException;
import Abstraction.MiniProject2.com.milel.exception.NullStudentObjectException;

public class StudentService{

    StudentReport report=new StudentReport();

    public String getGrade(Student student){

        try{

            report.validate(student);

            return report.findGrades(student);

        }
        catch(NullStudentObjectException e){

            return e.getMessage();

        }
        catch(NullNameException e){

            return e.getMessage();

        }
        catch(NullMarksArrayException e){

            return e.getMessage();

        }
    }
}