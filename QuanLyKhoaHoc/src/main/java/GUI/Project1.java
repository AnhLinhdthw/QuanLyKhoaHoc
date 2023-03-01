/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package GUI;

import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Project1 {

    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
//        PersonGUI personGUI = new PersonGUI();
//        FixID fixIDGUI = new FixID();
//        Find findGUI = new Find();
//        Detail detailGUI = new Detail();
//        UpdateCalendar updatecalendarGUI = new UpdateCalendar();
        
        int choice = -1;
        do {
            System.out.println("================Quan ly khoa hoc==================");
            System.out.println("=1:Them khoa hoc");
            System.out.println("=2:Sua thong tin");
            System.out.println("=3:Xoa khoa");
            System.out.println("=4:Tim kiem");
            System.out.println("=5:Xem chi tiet");
            System.out.println("=6:Cap nhat giang day");
            System.out.println("=0:Thoát=");
            System.out.println("==================================================");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    
                }
                case 2 -> {
                    
                }
                case 0 -> {
                }
            }
        } while (choice != 0);
    }
}
