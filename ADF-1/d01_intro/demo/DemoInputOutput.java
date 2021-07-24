/*
demo cach nhap xuat du lieu 
 */
package demo;

import java.util.*;

public class DemoInputOutput {

    public static void main(String[] args) {
        //khai bao 4 bien local chua ten, nam sinh, gioi tinh va diem thi
        String fullname;
        int yob;
        boolean gender;
        float mark;

        //nhap du lieu cho cac bien tren.
        //muon nhap lieu, khoi tao bien doi tuong [input] cua lop Scanner
        Scanner input = new Scanner(System.in);

        System.out.print("nhap ho ten sinh vien: ");
        //cho nhap 1 chuoi va luu  chuoi vo bien fullname 
        fullname = input.nextLine();

        System.out.print("nhap nam sinh: ");
        yob = input.nextInt();      //nhap 1 so nguyen, roi luu vo bien [yob] 

        System.out.print("nhap gioi tinh (true=nam/false=nu): ");
        gender = input.nextBoolean();

        System.out.print("nhap diem thi: ");
        mark = input.nextFloat();

        //in cac du lieu nhap ra man hinh
        System.out.println(" >> Ho ten: " + fullname);
        System.out.println(" >> Nam sinh: " + yob);
        System.out.println(" >> Gioi tinh: " + gender);
        System.out.println(" >> Diem ket qua: " + mark);
    }

}
