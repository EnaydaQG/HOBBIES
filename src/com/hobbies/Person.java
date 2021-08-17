package com.hobbies;

public class Person {
    int idPerson;
    String name;
    String lastName;
    int age;
    public Person(int idPerson, String name, String lastName, int age){
        this.idPerson = idPerson;
        this.lastName = lastName;
        this.name = name;
        this.age=age;
    }
    public String getName() {

        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getIdPerson() {
        return idPerson;
    }

    public int getAge() {
        return age;
    }

}
