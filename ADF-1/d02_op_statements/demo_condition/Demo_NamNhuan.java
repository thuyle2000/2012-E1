/*
kiem tra nam nhuan.
Nam nhuan co 366 ngay / thang 2 co 29
Do la nam co so hieu (chia het cho 4 va khong chia het cho 100) hoac (chia het cho 400)

 */
package demo_condition;

import java.util.Scanner;

public class Demo_NamNhuan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        test1();
        test2();
        
    }
    
    static void test1(){
        Scanner sc = new Scanner(System.in);
        System.out.print(">> vui long nhap nam muon kiem tra: ");
        int year = sc.nextInt();
        
        if((year%4==0 && year%100!=0) || (year%400==0)){
            System.out.printf(" %d la nam nhuan ! \n", year);
        }
        else{
            System.out.printf(" %d KHONG phai la nam nhuan ! \n", year);
        }
        
    }
    
    static void test2(){
        Scanner sc = new Scanner(System.in);
        System.out.print(">> vui long nhap nam muon kiem tra: ");
        int year = sc.nextInt();
        
        if(year % 400 ==0){
            System.out.printf(" >> %d la NAM NHUAN the ky ! \n", year);
        }
        else if( year %100 ==0){
            System.out.printf(" >> %d la nam the ky ! \n", year);
        }
        else if( year %4 ==0){
            System.out.printf(" >> %d la NAM NHUAN ! \n", year);
        }
        else{
            System.out.printf(" >> %d chi la nam binh thuong 365 ngay ! \n", year);
        }
    }
    
}
