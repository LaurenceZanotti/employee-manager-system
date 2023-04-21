package controller;
import model.EmployeeModel;

import java.util.Scanner;

public class EmployeeController {
    private final Scanner scan;

    public EmployeeController() {
        this.scan = new Scanner(System.in);
    }

    public void signup() {
        System.out.println("Signing up an employee\n");

        System.out.print("Name: ");
        String name = scan.nextLine();
        System.out.print("Age: ");
        int age = scan.nextInt();
        System.out.print("Gender: ");
        char gender = scan.next().charAt(0);
        System.out.print("Designation: ");
        String designation = scan.nextLine();
        System.out.print("Department: ");
        String department = scan.nextLine();
        System.out.print("Salary: ");
        float salary = scan.nextFloat();

        EmployeeModel employee = new EmployeeModel(name, age, gender, designation, department, salary);
        System.out.println(employee);

        System.out.println("Employee " + employee + " registered!\n");
    }
    public void list() {
        System.out.println("List of employees\n");
    }
    public void retrieveDetails() {
        System.out.println("Employee details\n");
    }
    public void updateDetails() {
        System.out.println("Update employee information\n");
    }
    public void delete() {
        System.out.println("Delete an employee\n");
    }
}
