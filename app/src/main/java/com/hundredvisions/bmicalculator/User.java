package com.hundredvisions.bmicalculator;

/**
 * Created by winikkc on 5/3/2016.
 */
public class User {
    // Create a User class for user data
    private String firstName, lastName;
    private int age;
    private String gender;
    private int weight;
    private int height;

    public User() {
        firstName = "Jane";
        lastName = "Doe";
        age = 21;
        gender = "female";
    }
    public User(String firstName, String lastName, String gender,
                int age, int feet, int inches, int pounds) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.height = getHeight(feet, inches);
        this.weight = pounds;
    }
    public int getHeight(int feet, int inches) {
        height = feet * 12 + inches;
        return height;
    }
    public String getFullName() {
        return firstName + lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getGender() {
        return gender;
    }
    public int getAge() {
        return age;
    }
    public int getHeight() {
        return height;
    }
    public int getWeight() {
        return weight;
    }
    public void setFirstName(String name) {
        this.firstName = name;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
}
