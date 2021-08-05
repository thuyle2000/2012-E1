/*
mo ta cau truc du lieu sinh vien Aptech la lop con cua Student, 
bao gom cac 
thuoc tinh : id, ten, nam sinh, gioi tinh, email, diem
(Student - > id, ten, gioi tinh, diem )
phuong thuc : input
 */
package data;

import java.util.Scanner;

public class StudentAptech extends Student{
    public String email;
    public int yob;

    @Override
    public void input() {
        super.input(); //goi lai ham input cua lop cha
        
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap email: ");
        email = sc.nextLine().trim();
        System.out.print("nhap nam sinh: ");
        yob = Integer.parseInt(sc.nextLine().trim());        
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", %s, %d", email, yob);
    }

}
