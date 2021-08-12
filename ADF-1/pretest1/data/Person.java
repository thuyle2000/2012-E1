/*

abstract class named Person
    - Fields ID, name, yob
    - Default constructor to initialize the above fields.
    - Method
        - public void accept() : allow user input data into data fields.
        Using try-catch exception for validation: ID, name not null- yob must be in range [1940-
        2000] .
        - public abtract void printInfo() : print details of an person.

 */
package data;

import java.util.Scanner;

public abstract class Person {

    public String id, name;
    public int yob;

    public Person() {
        id = "P01";
        name = "no name";
        yob = 2000;
    }

    public Person(String id, String name, int yob) {
        this.id = id;
        this.name = name;
        this.yob = yob;
    }
    
    

    //ham nhap du lieu cho cac field id, name, yob
    public void accept() {
        Scanner sc = new Scanner(System.in);

        //nhap ma so
        while (true) {
            System.out.print(" nhap id: ");
            id = sc.nextLine().trim();
            if (id.length() == 0) {
                System.out.println(">> Loi: Id khong duoc de trong !!!");
                continue;
            }
            break;  // du lieu id hop le : ket thuc vong lap nhap id
        }

        //nhap ten
        while (true) {
            System.out.print(" nhap ho ten: ");
            name = sc.nextLine().trim();
            if (name.length() == 0) {
                System.out.println(">> Loi: Ten khong duoc de trong !!!");
                continue;
            }
            break;  // du lieu name hop le : ket thuc vong lap nhap name
        }

        //nhap nam sinh
        while (true) {
            try {
                System.out.print(" nhap nam sinh [1940-2000]: ");
                yob = Integer.parseInt(sc.nextLine().trim());
                if (yob >= 1940 && yob <= 2000) {
                    break;  //nam sinh hop le => ket thuc vong lap nhap nam sinh
                }
                System.out.println(" >> Loi: Nam sinh ko hop le !!! ");
            } catch (Exception e) {
                System.out.println(" >> Loi: " + e.getMessage());
            }
        }
    }

    /* test case nhap nam sinh
    case 1: 2002 => sai => nhap lai
    case 2: 1900 => sai => nhap lai
    case 3: "nam 1990" : ko la chuoi so => ham Integer.parseInt() => exception 
            => catch : in loi ... => nhap lai
     */
    
    
    //ham truu tuong printInfo
    public abstract void printInfo();
}
