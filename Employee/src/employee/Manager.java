/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

/**
 *
 * @author ASUS TUF
 */
public class Manager extends Employee {

    public Manager(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("Manager is managing...");
    }
}