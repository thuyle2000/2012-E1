/*
Lop mo ta cau truc nhan vien hop dong chinh thuc.
- la lop con cua lop Nhan vien
- trien khai cac phuong thuc tinh luong, phu cap cua interface ICalc

- co them thuoc tinh chuc danh cong viec
 */

package data;

import java.util.Scanner;

public class Official extends Employee implements ICalc{
    public String position;

    public Official() {
    }

    public Official(String position, String id, String name, int salary, int wday) {
        super(id, name, salary, wday);
        this.position = position;
    }

    @Override
    public void input() {
        super.input(); //goi ham input() cua lop cha Employee
        
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chuc vu: ");
        position = sc.nextLine().trim();
    }
    
    
    @Override
    public float getSalary() {
        float sal = 0;
        if(wday<=24){
            sal = wday*salary/24 ;
        }
        else{
            sal =  salary + (wday-24)*OT*salary/24;
        }
        return sal;
    }

    @Override
    public float getAllowance() {
       float allowance = 100;
       switch(position.toUpperCase()){
           case "GD": allowance = 1000; break;
           case "PGD": allowance = 500; break;
           case "TP": allowance = 400; break;
       }
       return allowance;
    }

    @Override
    public String toString() {
        return String.format("%-3s, %-20s, %-8s, %5d, %2d, %9.2f",
            id, name, position,salary, wday, getSalary()+getAllowance());
    }
    
    
    
}
