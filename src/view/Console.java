package view;
import controller.EmployeeController;

import java.util.Scanner;

public class Console {
    private boolean isListening = false;
    private final Scanner scan;
    private final EmployeeController controller;

    public Console() {
        startListening();
        this.scan = new Scanner(System.in);
        this.controller = new EmployeeController();
    }

    /**
     * Displays the application description and usage
     */
    public void greetings() {
        System.out.println(
        """
        EmpManSys 0.0.0
        Author: @LaurenceZanotti (https://github.com/LaurenceZanotti)
        -------------------------------------------------------------
        Welcome to Employee Manager System.
        
        The Employee Management System is a console-based application
        that manages employees' records for a company. The application
        will allow administrators to create, read, update, and delete
        employee records.
        
        Enter a number below to perform an action:
        
        1 - Sign up an employee
        2 - List employees
        3 - Show an employee details
        4 - Update an employee information
        5 - Delete an employee
        
        0 - Quit
        """
        );
    }

    /**
     * Starts listening for user input to perform an action
     * within the command line
     */
    public void listen() {
        while (isListening) {
            System.out.println("Enter an option:\n");
            String in = scan.nextLine();
            performAction(in);
        }
    }

    /**
     * Requests the appropriate controller to perform an action
     *
     * @param in Takes a String input as an option to select
     *          an action with employees
     */
    private void performAction(String in) {
        switch (in) {
            case "0" -> {
                System.out.println("Thanks for using EmpManSys. Exiting...");
                stopListening();
            }
            case "1" -> controller.signup();
            case "2" -> controller.list();
            case "3" -> controller.retrieveDetails();
            case "4" -> controller.updateDetails();
            case "5" -> controller.delete();
            default -> System.out.println(
                    """
                    The options are:
                    1 - Sign up an employee
                    2 - List employees
                    3 - Show an employee details
                    4 - Update an employee information
                    5 - Delete an employee
                    """
            );
        }
    }

    private void stopListening() {
        this.isListening = false;
    }

    private void startListening() {
        this.isListening = true;
    }
}
