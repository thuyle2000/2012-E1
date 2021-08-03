/*
 * Lop mo ta 1 doi tuong nhan vien, bao gom
 * thuoc tinh (fields): ten cty,dc cong ty, id, ten, luongcb
 */
package data;

import java.util.Scanner;

public class Employee {
    //khai bao static field
    public String company = "IBM";
    public String address = "CMT8 HCMC";
        
    //khai bao cac instance fields
    public String id, name;
    public int salary;
    
    //dinh nghia ham nhap thong tin ca nhan
    public void input(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap ID: ");
        id = sc.nextLine().trim();
        
        System.out.print("Nhap ho ten: ");
        name = sc.nextLine().trim();
        
        while(true){
            System.out.print("Nhap luong cb [100-10000]: ");
            salary =  Integer.parseInt(sc.nextLine());  //sc.nextInt();
            if(salary>=100 && salary<=10000) break;
        }
    }
    
    
    //lap trinh lai ham toString()
    @Override
    public String toString() {
        return "id=" + id + ", name=" + name + ", salary=" + salary ;
    }

}
