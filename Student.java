package com.timbuchalk;

public class Student extends Person{
    private int studentNumber;



    public Student() {
        super();
    }

    /*Question 2
    Add a constructor to the class Student that sets the student’s name to a given argument string
    and sets the student’s number to zero.
    Your constructor should invoke another constructor in Student to accomplish this.
     */
    public Student(String initialName) {
        this(initialName, 0);
    }

    public Student(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public Student(String initialName, int studentNumber) {
        super(initialName);
        this.studentNumber = studentNumber;
    }

    public void reset(String newName, int newStudentNumber){
        setname(newName);
        studentNumber = newStudentNumber;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }
}
