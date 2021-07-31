/*
demo ve mang 1 chieu
 */
package test;

import java.util.Random;
import java.util.Scanner;
import data.Student;

public class TestArray {

    public static void main(String[] args) {
        TestArray ta = new TestArray();
        Scanner sc = new Scanner(System.in);
        String op;

        //tao menu de chon tinh nang muon kiem thu
        while (true) {
            System.out.println("\n ** MENU **");
            System.out.println("1. test mang so nguyen");
            System.out.println("2. test mang chuoi ky tu");
            System.out.println("3. test mang doi tuong");
            System.out.println("4. ket thuc");
            System.out.print(" >> Vui long nhap so chuc nang [1-4] : ");
            op = sc.nextLine().trim();

            switch (op) {
                case "1":
                    ta.demoIntArray();
                    break;
                case "2":
                    ta.demoStringArray();
                    break;
                case "3":
                    ta.demoStudentArray();
                    break;
                case "4":
                    return;
                default:
                    System.out.println("Nhap sai ma chuc nang !!!");
            }
        }
    }

    void demoIntArray() {
        Scanner sc = new Scanner(System.in);
        int n;

        while (true) {
            System.out.print("nhap so nguyen duong [5-10] : ");
            n = sc.nextInt();
            if (n >= 5 && n <= 10) {
                break; //thoat vong lap nhap n
            }
        }

        //khai bao 1 mang so nguyen [a] co n-phan tu
        int[] a = new int[n];

        //tao n-so ngau nhien va dien vo mang a[]
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            a[i] = 20 + rand.nextInt(80); // tao 1 so nn tu 20-100
        }
        
        //co tinh them phan tu thu n+1 cho a[] => bi ket loi khi chay ct => ket thuc CT luon
        //a[n] = 100;
        
        System.out.printf("Day so ngau nhien %d-phan tu : \n", n);
        for (int item : a) {
            System.out.printf(" %4d", item);
        }
        System.out.println();
    }

    void demoStringArray() {
        //khai bao mang chua ten cac mon hoc
        String[] monHoc = {"Logic C", "HTML", "BSJ", "Project", "DM"};
        System.out.println("\n Danh sach cac mon hoc");
        for (String item : monHoc) {
            System.out.println(item);
        }
    }

    void demoStudentArray() {
        Student[] ds = new Student[3];
        ds[0] = new Student("S1", "Lam Khang", 2002, 98, true);
        ds[1] = new Student("S2", "Hung Anh", 2004, 89, true);
        ds[2] = new Student("S3", "To Quyen", 2006, 66, false);

        System.out.println("\n Danh sach sinh vien");
        for (Student sv : ds) {
            System.out.println(sv);     //data.Student@54a097cc
//            sv.output(); //id=S1, ten=Lam Khang, nam sinh=2002, gioi tinh=nam, diem KQ thi: 98 
        }

    }
}
