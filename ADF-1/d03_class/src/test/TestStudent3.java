/*
kiem thu lop [Student]: ham dung ko doi so va ham dung co doi thu
 */
package test;
import data.Student;

public class TestStudent3 {

    public static void main(String[] args) {
        System.out.println("Demo ham dung");
        //tao ra 1 bien doi tuong [sv] kieu [Student]
        Student sv = new Student("Student100","Luu Xuan Loc",2000, 69, true);
        //in thong tin doi tuong [sv]
        sv.output();

        //tao them 1 bien doi tuong [sv2] kieu [Student]
        Student sv2 = new Student("Student101", "Nguyen Ngoc Son", 2004, 85, false);
        //in thong tin doi tuong [sv2]
        sv2.output();

        //tao them 1 bien doi tuong [sv3] kieu [Student]
        Student sv3 = new Student();
        //in thong tin doi tuong [sv3]
        sv3.output();
    }

}
