/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalmanagementsystem;

/**
 * Represents a node within the employee binary tree. Each node stores an
 * Employee object and references to its left and right child nodes. These
 * references allow the tree to connect employees and support its traversal
 * operations.
 */
public class TreeNode {

    Employee employee;
    TreeNode left;
    TreeNode right;

    public TreeNode(Employee employee) {
        this.employee = employee;
        this.left = null;
        this.right = null;
    }
}
