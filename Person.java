package com.timbuchalk;

public class Person {
    private String name;

    public Person()
    {
        name = "No name yet.";
    }

    public Person(String initialName) {
        name = initialName;
    }

    public void setname(String newName)
    {
        name = newName;
    }

    public String getName()
    {
        return name;
    }

    public void writeOutput()
    {
        System.out.println("Name: " + this.name);
    }

    public boolean hasSameName(Person otherPerson)
    {
        return this.name.equalsIgnoreCase(otherPerson.name);
    }
}
