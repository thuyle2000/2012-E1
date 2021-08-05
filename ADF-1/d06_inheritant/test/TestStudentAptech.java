/*
kiem thu doi tuong sinh vien Aptech
 */
package test;

import data.StudentAptech;
public class TestStudentAptech {

    public static void main(String[] args) {
        StudentAptech sv = new StudentAptech();
        System.out.println("SV Aptech #1: " + sv);
        
        StudentAptech sv2 = new StudentAptech();
        sv2.input();
        System.out.println("SV Aptech #2: " + sv2);
    }
    
}
