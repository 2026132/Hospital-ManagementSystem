/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hospitalmanagementsystem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ander
 */
public class HospitalManagementSystem {

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader("Applicants_Form_Hospital.txt"));

            String line;

            while ((line = reader.readLine()) != null) {

                String[] data = line.split(",");

                String name = data[0];

                ManagerType managerType = ManagerType.valueOf(
                        data[1].toUpperCase().replace(" ", "_"));

                DepartmentType department = DepartmentType.valueOf(
                        data[2].toUpperCase());

                Employee employee = new Employee(
                        name, managerType, department);

                employees.add(employee);
            }

            reader.close();

            System.out.println("File read successfully!");
            System.out.println("Total employees: " + employees.size());

            EmployeeSorter sorter = new EmployeeSorter();

            sorter.mergeSort(employees, 0, employees.size() - 1);

            HospitalMenu menu = new HospitalMenu();

            Scanner scanner = new Scanner(System.in);

            int choice;

            do {
                menu.displayMenu();

                choice = scanner.nextInt();
                scanner.nextLine();

            } while (choice != 6);

            System.out.println("Program terminated.");

        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }

}
