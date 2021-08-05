/*
quan ly danh sach cac doi tuong hinh hoc (hinh tron va hinh chu nhat), voi cac chuc nang:
1. them hinh tron
2. them hinh chu nhat
3. in ra danh sach cac doi tuong hinh hoc
 */
package test;

import java.util.*;
import data.*;

public class ShapeManagement {

    final int max = 10;
    int next = 0;
    Shape[] ds = new Shape[max];

    //them 1 hinh tron vo danh sach
    public void addCirle() {
        if (next == max) {
            System.out.println(" >> HT het bo nho luu tru !!!");
            return;
        }
        Circle c = new Circle();
        c.input();
        ds[next] = c;
        next++;
    }

    //them 1 hinh chu nhat vo danh sach
    public void addRectangle() {
        if (next == max) {
            System.out.println(" >> HT het bo nho luu tru !!!");
            return;
        }
        Shape r = new Rectangle();
        r.input();
        ds[next] = r;
        next++;
    }

    //ham in danh sach cac doi tuong hinh hoc
    void display() {
        if (next == 0) {
            System.out.println("HT chua co du lieu");
            return;
        }

        System.out.println("\n Danh sach cac doi tuong hinh hoc");
        for (int i = 0; i < next; i++) {
            System.out.println(ds[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String op;
        ShapeManagement am = new ShapeManagement();

        while (true) {
            System.out.println("\n === MENU ===");
            System.out.println("1. Them hinh tron");
            System.out.println("2. Them hinh chu nhat");
            System.out.println("3. In danh sach cac doi tuong hinh hoc");
            System.out.println("4. Ket thuc");
            System.out.print(" nhap ma so chuc nang [1-4]: ");
            op = sc.nextLine().trim();

            switch (op) {
                case "1":
                    am.addCirle();
                    break;
                case "2":
                    am.addRectangle();
                    break;
                case "3":
                    am.display();
                    break;
                case "4":
                    return;
            }
        }
    }

}
