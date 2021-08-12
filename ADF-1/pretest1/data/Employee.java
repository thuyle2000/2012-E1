/*
Create class Employee derives from Person, in package data, consists of:
    - Fields : salary, workedDays, position
    - Constructors to initialize the all fields
    - Override methods:
        - accept() : allow user to input additional details for an employee:
        invoke method accept() of super class.
        using try-catch exception for validation: salary belongs to [200-10000], salary belongs to
        [0-27].
        - printInfo() : display details of an employee including id, name, age, position, salary,
        worked days, income (salary* worked days/26)
        - toString() : return a string presenting all the details of a employee.
 */
package data;

import java.util.Scanner;

public class Employee extends Person {

    public int salary, workedDays;
    public String position;

    public Employee() {
    }

    public Employee(int salary, int workedDays, String position, String id, String name, int yob) {
        super(id, name, yob);
        this.salary = salary;
        this.workedDays = workedDays;
        this.position = position;
    }

    @Override
    public void accept() {
        super.accept(); //goi lai ham nhap du lieu cua lop cha Person (de nhap id, name va yob)

        Scanner sc = new Scanner(System.in);

        //nhap tien luong [200-10000]
        while (true) {
            try {
                System.out.print(" nhap luong cb [200-10000]: ");
                salary = Integer.parseInt(sc.nextLine().trim());
                if (salary >= 200 && salary <= 10000) {
                    break;  //luong cb hop le => ket thuc vong lap nhap lieu
                }
                System.out.println(" >> Loi: Luong co ban ko hop le !!! ");
            } catch (Exception e) {
                System.out.println(" >> Loi: " + e.getMessage());
            }
        }

        //nhap so ngay lam viec trong thang [0-27]
        while (true) {
            try {
                System.out.print(" nhap so ngay lam viec [0-27]: ");
                workedDays = Integer.parseInt(sc.nextLine().trim());
                if (workedDays >= 0 && workedDays <= 27) {
                    break;  //so ngay lv hop le => ket thuc vong lap nhap lieu
                }
                System.out.println(" >> Loi: So ngay lam viec ko hop le !!! ");
            } catch (Exception e) {
                System.out.println(" >> Loi: " + e.getMessage());
            }
        }

        System.out.print(" nhap chuc danh cong viec: ");
        position = sc.nextLine().trim();

    }

    @Override
    public void printInfo() {
        System.out.println("\n Thong tin chi tiet nhan vien ");
        System.out.println(" id: " + id);
        System.out.println(" ten: " + name);
        int age = java.time.Year.now().getValue() - yob;
        System.out.println(" tuoi: " + age);
        System.out.println(" chuc danh cong viec: " + position);
        System.out.println(" luong co ban: " + salary);
        System.out.println(" so ngay lam viec: " + workedDays);
        System.out.println(" luong cuoi thang: " + salary * workedDays / 26);
    }

    @Override
    public String toString() {
        return String.format("%s - %s - %d - %d", id, name, yob, salary);
    }

}
