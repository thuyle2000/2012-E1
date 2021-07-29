/*
kiem thu lop [Student], kiem them ham output()
 */
package test;

import data.Student;

public class TestStudent2 {

    public static void main(String[] args) {
        //tao ra 1 bien doi tuong [sv] kieu [Student]
        Student sv;

        //cap phat bo nho cho bien doi tuong [sv] 
        sv = new Student();

        //gan gia tri cho cac fields cua bien [sv]
        sv.id = "student100";
        sv.name = "Luu Xuan Loc";
        sv.yob = 2000;
        sv.mark = 69;
        sv.gender = true;

        //in thong tin doi tuong [sv]
        sv.output();

        //tao them 1 bien doi tuong [sv2] kieu [Student]
        Student sv2 = new Student();
        //gan gia tri cho cac fields cua doi tuong [sv2]
        sv2.id = "student101";
        sv2.name = "Nguyen Ngoc Son";
        sv2.yob = 2004;
        sv2.mark = 85;
        sv2.gender = false;

        //in thong tin doi tuong [sv2]
        sv2.output();

        //tao them 1 bien doi tuong [sv3] kieu [Student]
        Student sv3 = new Student();
        //in thong tin doi tuong [sv3]
        sv3.output();
    }
}
