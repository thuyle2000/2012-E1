/*
Kiem thu doi tuong co kieu Student
 */
package test;

import data.Student;
public class TestStudent {

    public static void main(String[] args) {
        Student sv1 = new Student();
        System.out.println("Sv thu 1: " + sv1);
        Student sv2 = new Student();
        System.out.println("Sv thu 2: " + sv2);
        Student sv3 = new Student("S03", "Loc", true, 90);
        System.out.println("Sv thu 3: " + sv3);
        Student sv4 = new Student();
        sv4.input();
        System.out.println("Sv thu 4: " + sv4);
    }
    
}
