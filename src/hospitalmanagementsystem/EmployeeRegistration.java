/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalmanagementsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeRegistration {

    public void registerEmployee(ArrayList<Employee> employees, Scanner scanner) {

        String name;

        while (true) {

            System.out.print("Enter employee full name: ");
            name = scanner.nextLine().trim();

            boolean nameExists = false;

            for (Employee employee : employees) {
                if (employee.getName().equalsIgnoreCase(name)) {
                    nameExists = true;
                    break;
                }
            }

            if (nameExists) {
                System.out.println("This employee is already registered.");
                continue;
            }

            if (name.isEmpty()) {
                System.out.println("Name cannot be empty.");
            } else if (!name.matches("[\\p{L}]+(?:[ '-][\\p{L}]+)+")) {
                System.out.println("Please enter a valid full name (first name and surname).");
            } else {
                break;
            }
        }

        System.out.println("\nSelect Manager Type:");
        System.out.println("1. Hospital Director");
        System.out.println("2. Head Manager");
        System.out.println("3. Assistant Manager");
        System.out.println("4. Team Lead");

        int managerChoice;

        while (true) {

            System.out.print("Enter your choice: ");

            if (scanner.hasNextInt()) {
                managerChoice = scanner.nextInt();
                scanner.nextLine();

                if (managerChoice >= 1 && managerChoice <= 4) {
                    break;
                }

                System.out.println("Invalid option. Choose between 1 and 4.");

            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
            }
        }

        ManagerType managerType = null;
        switch (managerChoice) {

            case 1:
                managerType = ManagerType.HOSPITAL_DIRECTOR;
                break;

            case 2:
                managerType = ManagerType.HEAD_MANAGER;
                break;

            case 3:
                managerType = ManagerType.ASSISTANT_MANAGER;
                break;

            case 4:
                managerType = ManagerType.TEAM_LEAD;
                break;

        }

        System.out.println("\nSelect Department:");
        System.out.println("1. HR");
        System.out.println("2. Emergency");
        System.out.println("3. Paediatrics");
        System.out.println("4. Administration");
        System.out.println("5. Pharmacy");
        System.out.println("6. Cardiology");
        System.out.println("7. Radiology");

        int departmentChoice;

        while (true) {

            System.out.print("Enter your choice: ");

            if (scanner.hasNextInt()) {
                departmentChoice = scanner.nextInt();
                scanner.nextLine();

                if (departmentChoice >= 1 && departmentChoice <= 7) {
                    break;
                }

                System.out.println("Invalid option. Choose between 1 and 7.");

            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
            }
        }

        DepartmentType department;

        switch (departmentChoice) {

            case 1:
                department = DepartmentType.HR;
                break;

            case 2:
                department = DepartmentType.EMERGENCY;
                break;

            case 3:
                department = DepartmentType.PAEDIATRICS;
                break;

            case 4:
                department = DepartmentType.ADMINISTRATION;
                break;

            case 5:
                department = DepartmentType.PHARMACY;
                break;

            case 6:
                department = DepartmentType.CARDIOLOGY;
                break;

            case 7:
                department = DepartmentType.RADIOLOGY;
                break;

            default:
                System.out.println("Invalid Department.");
                return;
        }

        Employee employee = new Employee(name, managerType, department);

        employees.add(employee);

        System.out.println("\nEmployee registered successfully!");
        System.out.println("-----------------------------");
        employee.displayEmployee();
        System.out.println("-----------------------------");

    }
}
