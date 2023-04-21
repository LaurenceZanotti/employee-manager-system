package model;

public class EmployeeModel {
    private String name;
    private int age;
    private char gender;
    private String designation;
    private String department;
    private float salary;

    public EmployeeModel(String name, int age, char gender, String designation, String department, float salary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.designation = designation;
        this.department = department;
        this.salary = salary;
    }
}
