/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalmanagementsystem;

/**
 *
 * @author ander
 */

public class Department {

    private String name;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void displayDepartment() {
        System.out.println("Department: " + name);
    }
}

