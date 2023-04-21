package view;

public class Console {
    public Console() {}


    /**
     * Displays the application description and usage
     */
    public static void greetings() {
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
        2 - Show an employee details
        3 - Update an employee information
        4 - Delete an employee
        """
        );
    }
}
