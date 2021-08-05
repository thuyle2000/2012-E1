/*
Mo ta 1 class sinh vien, bao gom:
- thuoc tinh: id, ten, gioi tinh, diem
- phuong thuc: nhap 
 */
package data;

import java.util.Scanner;

public class Student {
    public String id, name;
    public boolean gender;
    public int mark;
    
    //ham dung ko co doi so
    public Student() {
        id="S01";
        name ="Hung Anh";
        gender = true; //true - nam /false - nu
        mark = 40;
    }

    //ham dung co doi so
    public Student(String id, String name, boolean gender, int mark) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.mark = mark;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap id: "); 
        id = sc.nextLine().trim();
        System.out.print("nhap ten:");
        name = sc.nextLine().trim();
        System.out.print("nhap gioi tinh (nam|nu): ");
        gender = sc.nextLine().trim().equalsIgnoreCase("nam"); //NAM|nam|Nam
        System.out.print("nhap diem KQ thi: ");
        mark = Integer.parseInt(sc.nextLine().trim());
    }
    @Override
    public String toString() {
//        return "id="+id+", ten="+name;
        return String.format("%s, %s, %s, %d", id, name,gender?"nam":"nu", mark);
    }
    
    
    
}
