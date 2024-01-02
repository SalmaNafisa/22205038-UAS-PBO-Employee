/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

/**
 *
 * @author ASUS TUF
 */
public class Main {

    public static void main(String[] args) {
        // Membuat objek manajer
        Manager manajer = new Manager("John Doe");

        // Membuat objek pengembang
        Developer pengembang = new Developer("Jane Doe");

        // Membuat objek desainer
        Designer desainer = new Designer("John Smith");

        // Memanggil metode "work()"
        manajer.work();
        pengembang.work();
        desainer.work();
    }
}
