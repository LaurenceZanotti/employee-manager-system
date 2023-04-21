package view;
import java.util.Scanner;

public class Console {
    private boolean isListening = false;
    private Scanner scan;

    public Console() {
        startListening();
        this.scan = new Scanner(System.in);
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
            System.out.println(in);
            stopListening();
        }
    }

    private void stopListening() {
        this.isListening = false;
    }

    private void startListening() {
        this.isListening = true;
    }
}
