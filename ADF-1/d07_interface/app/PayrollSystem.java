/*
Chuong trinh quan ly tien luong nhan vien:
- them nhan vien moi
- in bang danh sach luong
- in bang luong cua cac nhan vien co thu nhap thuc te <1000
 */
package app;

import data.*;
import java.util.*;

public class PayrollSystem {

    public final int max = 10;
    public int next = 0;
    public Official[] ds = new Official[max];

    //ham them 1 nhan vien moi
    public void add() {
        //kiem tra mang ds[] co cho trong ko?
        if (next == max) {
            System.out.println("HT het bo nho luu tru !!!");
            return;
        }

        Official e = new Official();
        e.input();
        ds[next] = e;
        next++;
    }

    //ham in bang luong nhan vien
    public void displayAll() {
        if (next == 0) {
            System.out.println("HT chua co du lieu.");
            return;
        }

        System.out.println("\n Bang luong nhan vien");
        for (int i = 0; i < next; i++) {
            System.out.println(ds[i]);
        }
    }

    //ham in bang luong nhan vien co thu nhap thuc te <1000
    public void display1000() {
        if (next == 0) {
            System.out.println("HT chua co du lieu.");
            return;
        }

        int cnt1000 = 0;

        System.out.println("\n Bang luong nhan vien co thu nhap <1000");
        for (int i = 0; i < next; i++) {
            if (ds[i].getSalary() + ds[i].getAllowance() < 1000) {
                System.out.println(ds[i]);
                cnt1000++;
            }
        } //KET THUC FOR

        if (cnt1000 == 0) {
            System.out.println("KO tim thay NV co muc thu nhap <1000");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String op = "";
        
        PayrollSystem ps = new PayrollSystem();
        while(true){
            System.out.println("\n === MENU ===");
            System.out.println("1. Them Nhan vien");
            System.out.println("2. In bang luong NV");
            System.out.println("3. In bang luong NV < 1000");
            System.out.println("4. Ket thuc");
            System.out.print(" nhap ma so chuc nang [1-4]: ");
            op = sc.nextLine().trim();
            
            switch(op){
                case "1": ps.add(); break;
                case "2": ps.displayAll();break;
                case "3": ps.display1000(); break;
                case "4": return;
            }
        }
    }

}
