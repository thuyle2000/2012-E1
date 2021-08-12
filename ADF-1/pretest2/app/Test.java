package app;

import data.*;
import java.util.*;

public class Test {

    public final int max = 10;
    public int next = 0;
    public Cylinder[] cList = new Cylinder[max];

    public void add() {
        if (next == max) {
            System.out.println(" >> HT het bo nho !!!");
            return;
        }
        Cylinder c = new Cylinder();
        c.accept();
        cList[next++] = c;
    }

    public void display() {
        if (next == 0) {
            System.out.println(" >> HT chua co du lieu !");
            return;
        }

        System.out.println(" >> Danh sach cac hinh khoi <<");
        for (int i = 0; i < next; i++) {
            System.out.println(cList[i]);
        }
    }

    public void display(float v) {
        if (next == 0) {
            System.out.println(" >> HT chua co du lieu !");
            return;
        }

        int cntVolume = 0;
        System.out.printf(" >> Danh sach cac hinh khoi co the tich >= %.2f \n ", v);
        for (int i = 0; i < next; i++) {
            if (cList[i].volume() >= v) {
                cList[i].pintInfo();
                cntVolume++;
            }
        }// ket thuc FOR

        if (cntVolume == 0) {
            System.out.println(" >> Ko tim thay !!!");
        }
    }

    public static void main(String[] args) {
        Test t = new Test();
        String op = "";
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n MENU");
            System.out.println("1. Them hinh khoi tru");
            System.out.println("2. In danh sach cac hinh khoi tru");
            System.out.println("3. In cac hinh khoi co the tich theo yeu cau");
            System.out.println("4. ket thuc chuong trinh");
            System.out.print(" vui long nhap ma so chuc nang [1-4]: ");
            op = sc.nextLine().trim();

            switch (op) {
                case "1":
                    t.add();
                    break;
                case "2":
                    t.display();
                    break;
                case "3":
                    float v = 0;
                    while (true) {
                        try {
                            System.out.print("nhap the tich khoi > 0: ");
                            v = Float.parseFloat(sc.nextLine().trim());
                            if (v > 0) {
                                break;
                            }
                        } catch (Exception e) {
                            System.out.println(" >> Loi: " + e.getMessage());
                        }
                    }

                    t.display(v);
                    break;
                case "4":
                    return;
            }
        }

    }

}
