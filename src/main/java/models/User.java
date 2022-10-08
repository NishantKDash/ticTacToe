package main.java.models;

public class User {
    private String name;
    private int age;
    private String email;

    public User(String name , int age , String email)
    {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
