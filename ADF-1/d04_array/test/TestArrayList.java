/*
Demo ArrayList
 */
package test;

import data.Student;
import java.util.ArrayList;
import java.util.Scanner;
public class TestArrayList {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        //tao 1 arraylist chua ds cac doi tuong sinh vien 
        ArrayList<Student> ds = new ArrayList<>(); 
        
        while(true){
            System.out.println("Nhap thong tin sinh vien: ");
            Student sv = new Student();           
            System.out.print(" nhap id: "); sv.id = sc.nextLine();
            System.out.print(" nhap ten: "); sv.name= sc.nextLine();
            System.out.print(" nhap nam sinh: "); sv.yob= sc.nextInt();
            System.out.print(" nhap gioi tinh (true/false): "); sv.gender= sc.nextBoolean();
            System.out.print(" nhap diem thi: "); sv.mark= sc.nextInt();
            
            //luu bien doi tuong [sv] vo cuoi danh sach arraylist [ds]
            ds.add(sv);
            
            System.out.print(" >> Ban co muon tiep tuc them sinh vien ? (y/n) ");
            sc = new Scanner(System.in);
            if(sc.nextLine().trim().equalsIgnoreCase("y")) continue;
            break;
        }
        
        System.out.println(" >> Danh sach sinh vien ");
        for (Student sinhvien : ds) {
            System.out.println(sinhvien);
        }
        System.out.println(">> Tong so sinh vien: " + ds.size());      
    }

}
