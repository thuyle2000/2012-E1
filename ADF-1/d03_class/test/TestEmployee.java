/*
kiem thu lop [Employee]
 */
package test;

import data.Employee;

public class TestEmployee {

    public static void main(String[] args) {
        Employee e = new Employee();
        System.out.println("id = " + e.id);
//        System.out.println("Ten = " + e.name);
//        System.out.println("Chuc vu = " + e.position);
//        System.out.println("Luong cb = " + e.salary);
       
        //in thong tin nhan vien
        e.print();
        
        //in luong cb cua nhan vien
        e.print("E02");
        e.print("E01");
        
        
    }
    
}
