/*
Lop Nhanvien, bao gom cac thuoc tinh:
id, ten, luong cb, so ngay lam viec
 */
package data;

import java.util.Scanner;

public class Employee {

    public String id, name;
    public int salary, wday;

    //ham dung ko tham so
    public Employee() {
    }

    //ham dung co tham so
    public Employee(String id, String name, int salary, int wday) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.wday = wday;
    }

    //ham nhap du lieu cho cac thuoc tinh
    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("nhap id: ");
        id = sc.nextLine().trim();

        System.out.print("nhap ho ten: ");
        name = sc.nextLine().trim();

        while (true) {
            try {
                System.out.print("nhap luong cb [100-10000] :");
                salary = Integer.parseInt(sc.nextLine().trim());
                if (salary >= 100 && salary <= 10000) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Loi sai: " + e.getMessage());
            }

        }

        while (true) {
            try {
                System.out.print("nhap so ngay lv [0-31] :");
                wday = Integer.parseInt(sc.nextLine().trim());
                if (wday >= 0 && wday <= 31) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Loi sai nhap lieu");
            }
        }

    }

}
