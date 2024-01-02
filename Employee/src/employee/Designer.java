/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

/**
 *
 * @author ASUS TUF
 */
public class Designer extends Employee {

    public Designer(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("Designer is designing...");
    }
}
