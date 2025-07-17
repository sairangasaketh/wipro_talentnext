package Miniproject.mile1.bean;


public class Student {

    // variables 
    String name ; 
    int marks[] ; 
    String grade ;

    // constructors 
    public Student() {

    }
    public Student( String grade , int[] marks , String name ) {
        this.grade = grade ;
        this.marks = marks ; 
        this.name = name; 
    }

    // methods 
    // setters 
    public void setName(String name) {
        this.name = name;
    }
    public void setMarks(int[] marks) {
        this.marks = marks;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }

    // getters 
    public String getName() {
        return name;
    }
    public int[] getMarks() {
        return marks;
    }
    public String getGrade() {
        return grade;
    }

    
}