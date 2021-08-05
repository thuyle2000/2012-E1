/*
demo kieu tham chieu, kieu doi tuong
 */
package test;

import data.*;
public class Test {

    public static void main(String[] args) {
        //kieu tham chieu va kieu doi tuong cua sv1 = Student
        Student sv1 = new Student();
        System.out.println("sv1 : " + sv1);
        
        //kieu doi tuong cua sv2 = Student
        //kieu tham chieu cua sv2 = StudentAptech 
        Student sv2 = new StudentAptech();
        System.out.println("sv2 : " + sv2);
        
    }
    
}
