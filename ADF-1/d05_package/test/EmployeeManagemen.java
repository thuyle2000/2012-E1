/*
Chuong trinh quan ly danh sach nhan vien
 */
package test;

import data.*;
import java.util.*;

public class EmployeeManagemen {

    public static void main(String[] args) {
        EmployeeArray ea = new EmployeeArray();
        Scanner sc = new Scanner(System.in);
        String op = "";

        //thiet ke menu de thuc hien cac chuc nang quan ly nhan vien
        while (true) {
            System.out.println("\n >> MENU <<");
            System.out.println("1. Them nhan vien moi");
            System.out.println("2. In danh sach nhan vien");
            System.out.println("3. Xoa nhan vien ");
            System.out.println("4. Tim nhan vien theo ten");
            System.out.println("5. ket thuc chuong trinh");
            System.out.print(" >> nhap ma so chuc nang muon thuc hien [1-5]: ");
            op = sc.nextLine();

            switch (op) {
                case "1":
                    ea.add();
                    break;
                case "2":
                    ea.display();
                    break;

                case "3":
                    System.out.print("nhap ma so NV muon xoa:");
                    //String ms = sc.nextLine().trim();
                    ea.remove(sc.nextLine().trim());
                    break;
                case "4":
                    System.out.print("nhap ten NV muon tim:");
                    ea.display(sc.nextLine().trim());
                    break;
                case "5":
                    return;
                default:
                    System.out.println("Nhap sai ma so chuc nang !!!");
            }
        }
    }

}
