/*
Day la chuong trinh Quan ly sinh vien Aptech
1. dung mang de luu ds sinh vien
2. thiet ke 1 he thong thuc don : them, xem va tim kiem sv
 */

package test;

import data.StudentAptech;
import java.util.Scanner;

public class AptechManagement {

    final int max=10;   //bien hang dinh nghia so luong sv toi da.
    int next = 0;       //bien chua so sv hien co trong danh sach quan ly
    StudentAptech[] ds = new StudentAptech[max]; //mang chua toi da max-sv
    
    void add(){
        //kiem tra mang ds[] co con cho ko ?
        if(next==max){
            System.out.println("HT het bo nho !");
            return;
        }
        StudentAptech sa = new StudentAptech();
        sa.input();
        ds[next] = sa;
        next++;
    }
    
    //ham in danh sach sinh vien 
    void display(){
        if(next==0){
            System.out.println("HT chua co du lieu");
            return;
        }
        
        System.out.println("\n Danh sach sinh vien");
        for (int i = 0; i < next; i++) {
            System.out.println(ds[i]);
        }
    }
    
    //ham in danh sach cac sinh vien thi dau (diem >=40)
    void displayPassExam(){
        if(next==0){
            System.out.println("HT chua co du lieu");
            return;
        }
        
        int countPass=0;
        System.out.println("\n Danh sach sinh vien thi dau");
        for (int i = 0; i < next; i++) {
            if(ds[i].mark>=40){
                System.out.println(ds[i]);
                countPass++;
            }
        } // Ket thuc FOR
        
        if(countPass==0){
            System.out.println("Ko tim thay sinh vien thi dau !!!");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String op;
        AptechManagement am = new AptechManagement();
        
        while(true){
            System.out.println("\n === MENU ===");
            System.out.println("1. Them SV");
            System.out.println("2. In danh sach SV");
            System.out.println("3. In danh sach SV thi dau");
            System.out.println("4. Ket thuc");
            System.out.print(" nhap ma so chuc nang [1-4]: ");
            op = sc.nextLine().trim();
            
            switch(op){
                case "1": am.add(); break;
                case "2": am.display(); break;
                case "3": am.displayPassExam(); break;
                case "4": return;
            }
        }
        
    }
    
}
