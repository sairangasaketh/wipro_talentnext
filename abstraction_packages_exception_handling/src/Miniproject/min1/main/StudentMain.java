package Miniproject.min1.main;

import Miniproject.mile1.bean.Student;
import Miniproject.mile1.service.StudentService;

public class StudentMain 
{
    static Student data[] = new Student[4] ;    
    // Constructor 
    StudentMain() 
    {
        for (int i = 0; i < data.length; i++) {
            data[i] = new Student() ; 
        }
        // initialize the objects 
        // data[0] = new Student("Sekar" , new int[]{85,75,95}) ; 
        // data[1] = new Student(null, new int[]{11,22,33}) ; 
        // data[2] = null  ; 
        // data[3] = new Student("Manoj" , null ); 
    } 
    
    public static void main(String[] args) {
        StudentService ss = new StudentService() ; 

        try {

        }
        catch(Exception e) 
        {
            e.printStackTrace(); 
        }

    }

}
