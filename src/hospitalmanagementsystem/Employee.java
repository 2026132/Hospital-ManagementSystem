/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalmanagementsystem;

/**
 *
 * @author ander
 */

public class Employee {

    private String name;
    private String managerType;
    private String department;

    public Employee(String name, String managerType, String department) {
        this.name = name;
        this.managerType = managerType;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getManagerType() {
        return managerType;
    }

    public String getDepartment() {
        return department;
    }

    public void displayEmployee() {
        System.out.println("Name: " + name);
        System.out.println("Manager Type: " + managerType);
        System.out.println("Department: " + department);
    }
}

