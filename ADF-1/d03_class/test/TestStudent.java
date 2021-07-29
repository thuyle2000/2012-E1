/*
chuong trinh kiem thu lop [Student]
 */
package test;

import data.Student;

public class TestStudent {

    public static void main(String[] args) {
        //tao ra 1 bien doi tuong [sv] kieu [Student]
        Student sv;
        
        //cap phat bo nho cho bien doi tuong [sv] 
        sv = new Student();
        
        //gan gia tri cho cac fields cua bien [sv]
        sv.id = "student100";
        sv.name ="Luu Xuan Loc";
        sv.yob = 2000;
        sv.mark = 69;
        sv.gender = true;
        
        
        //in thong tin doi tuong [sv]
        System.out.printf("id=%s, ten=%s, nam sinh=%d, gioi tinh=%s, diem KQ: %d \n",sv.id, sv.name, sv.yob, sv.gender, sv.mark);
        
        //tao them 1 bien doi tuong [sv2] kieu [Student]
        Student sv2 = new Student();     
        //gan gia tri cho cac fields cua doi tuong [sv2]
        sv.id = "student101";
        sv2.name ="Nguyen Ngoc Son";
        sv2.yob = 2004;
        sv2.mark = 85;
        sv2.gender = false;
        
         //in thong tin doi tuong [sv2]
        System.out.printf("id=%s, ten=%s, nam sinh=%d, gioi tinh=%s, diem KQ: %d \n",sv2.id, sv2.name, sv2.yob, sv2.gender, sv2.mark);   
        
    }
    
}
