package com.timbuchalk;

public class Undergraduate extends Student{
    private int level;

    public Undergraduate() {
        super();
        level = 1;
    }

    public Undergraduate(String initialName, int initialStudentNumber, int initiaLlevel) {
        super(initialName, initialStudentNumber);
        setLevel(initiaLlevel);
    }

    /*Question 4
    Rewrite the definition of the method reset for the class Undergraduate in,
    using setName and setStudentNumber instead of the overloaded reset method name.
     */
    public void newReset(String newName, int newStudentNumber, int newLevel){
        setname(newName);
        setStudentNumber(newStudentNumber);
        setLevel(newLevel);
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int newLevel) {
        if((1 <= newLevel) && (newLevel <= 4))
            level = newLevel;
        else{
            System.out.println("Illegal level!");
            System.exit(0);
        }
    }

    /*Question 3
    Rewrite the definition of the method writeOutput for the class Undergraduate,
    using getName and getStudentNumber instead of super.writeOutput.
     */
    public void writeOutput(){
        System.out.println("Student name: " + getName());
        System.out.println("Student number: " + getStudentNumber());
        System.out.println("Student level: " + level);
    }

    public boolean equals(Undergraduate otherUndergraduate){
        return (getName().equalsIgnoreCase(otherUndergraduate.getName()))
                && (getStudentNumber() == otherUndergraduate.getStudentNumber())
                && (this.level == otherUndergraduate.getLevel());
    }
}
