/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalmanagementsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class HospitalMenu {

    public void displayMenu() {

        System.out.println("\n===== HOSPITAL MANAGEMENT SYSTEM =====");
        System.out.println("1. Display All Employees");
        System.out.println("2. Search Employee");
        System.out.println("3. Add Employee");
        System.out.println("4. Sort Employees");
        System.out.println("5. Display Binary Tree");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
    }

    public void runMenu(ArrayList<Employee> employees) {

        Scanner scanner = new Scanner(System.in);
        EmployeeDisplay display = new EmployeeDisplay();
        EmployeeSearch search = new EmployeeSearch();
        EmployeeRegistration registration = new EmployeeRegistration();
        EmployeeSorter sorter = new EmployeeSorter();

        int choice;

        do {

            displayMenu();

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    display.displayAllEmployees(employees);
                    break;

                case 2:
                    search.searchAndDisplayEmployee(employees, scanner);
                    break;

                case 3:
                    registration.registerEmployee(employees, scanner);
                    break;

                case 4:
                    sorter.mergeSort(employees, 0, employees.size() - 1);

                    System.out.println("Employees sorted successfully!");
                    display.displayAllEmployees(employees);
                    break;

                case 6:
                    System.out.println("Program terminated.");
                    break;

                default:
                    System.out.println("Option not implemented yet.");
            }

        } while (choice != 6);
    }
}
