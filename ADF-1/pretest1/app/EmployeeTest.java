/*
Quan ly danh sach nhan vien:
them, in danh sach , tim kiem va xoa nhan vien theo ma so 
 */
package app;

import data.*;
import java.util.*;

public class EmployeeTest {

    final int max = 10;
    int next = 0;
    Employee[] ds = new Employee[max];

    // ham nhap them 1 nv moi va luu vo mang ds[]
    public void add() {
        if (next == max) {
            System.out.println(" >> HT het bo nho de luu du lieu !");
            return;
        }

        Employee e = new Employee();
        e.accept();

        ds[next] = e;
        next++;
    }

    //ham in danh sach nhan vien 
    public void display() {
        if (next == 0) {
            System.out.println(" >> HT chua so du lieu !");
            return;
        }

        System.out.println("\n >> Danh sach nhan vien");
        for (int i = 0; i < next; i++) {
            System.out.println(ds[i]);
        }
    }

    //ham tim va in danh sach nhan vien ten
    public void display(String tenNV) {
        if (next == 0) {
            System.out.println(" >> HT chua so du lieu !");
            return;
        }

        int cntTen = 0;

        tenNV = tenNV.toLowerCase();
        for (int i = 0; i < next; i++) {
            if (ds[i].name.toLowerCase().contains(tenNV)) {
                ds[i].printInfo();
                cntTen++;
            }
        }//ket thuc vong FOR

        if (cntTen == 0) {
            System.out.println(">> Khong tim thay !!!");
        }
    }

    //ham tim va xoa nhan vien theo ma so
    public void remove(String maNV) {
        if (next == 0) {
            System.out.println(" >> HT chua so du lieu !");
            return;
        }

        for (int i = 0; i < next; i++) {
            if (ds[i].id.equals(maNV)) {
                for (int k = i + 1; k < next; k++) {
                    ds[k - 1] = ds[k];
                }
                System.out.println("Da xoa nhan vien thanh cong !");
                next--;
                return;
            }
        }//ket thuc vong FOR

        System.out.println(">> Ko tim thay nv muon xoa !");

    }

    public static void main(String[] args) {
        EmployeeTest et = new EmployeeTest();
        String op = "";
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n MENU");
            System.out.println("1. Them nhan vien");
            System.out.println("2. In danh sach nhan vien");
            System.out.println("3. Tim nhan vien theo ten");
            System.out.println("4. Xoa nhan vien theo ma so");
            System.out.println("5. ket thuc chuong trinh");
            System.out.print(" vui long nhap ma so chuc nang [1-5]: ");
            op = sc.nextLine().trim();

            switch (op) {
                case "1":
                    et.add();
                    break;
                case "2":
                    et.display();
                    break;
                case "3":
                    System.out.print("nhap ten nhan vien: ");
                    et.display(sc.nextLine().trim());
                    break;
                case "4":
                    System.out.print("nhap ma so nhan vien: ");
                    et.remove(sc.nextLine().trim());
                    break;
                case "5":
                    return;
            }
        }
    }

}
