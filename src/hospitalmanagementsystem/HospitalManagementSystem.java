/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hospitalmanagementsystem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

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
                String managerType = data[1];
                String department = data[2];

                Employee employee = new Employee(
                        name, managerType, department);

                employees.add(employee);
            }

            reader.close();

            System.out.println("File read successfully!");
            System.out.println("Total employees: " + employees.size());

        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }

}
