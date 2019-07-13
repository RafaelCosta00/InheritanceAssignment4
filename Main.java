/*
CCSF Class 111B
Student Rafael Ferreira Costa
Created on 07/04/2018

Inheritance - Assignment 4
Questions 2, 3 and 4
 */

package com.timbuchalk;

public class Main {

    public static void main(String[] args) {
        Undergraduate undergraduate1 = new Undergraduate();
        undergraduate1.writeOutput();

        System.out.println("------------------");

        undergraduate1.newReset("Rafael", 123, 4);
        undergraduate1.writeOutput();

        System.out.println("-----------------------");

        Undergraduate undergraduate2 = new Undergraduate();
        undergraduate2.setname("Rafael");
        undergraduate2.setStudentNumber(123);
        undergraduate2.setLevel(4);
        undergraduate2.writeOutput();

        System.out.println("Undergraduate 1 and 2 equals: " + undergraduate2.equals(undergraduate1));

        System.out.println("---------------------");

        Undergraduate undergraduate3 = new Undergraduate("Rafael", 1234, 4);
        undergraduate3.writeOutput();

        System.out.println("Undergraduate 1 and 3 equals: " + undergraduate1.equals(undergraduate3));

        //casting undergraduate to person and checking polymorphismo
        System.out.println();
        Undergraduate ug = new Undergraduate("Sam", 999, 1);
        Person p = (Person) ug;
        p.writeOutput();
    }
}
