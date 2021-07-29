/*
kiem thu phuong thuc
 */
package test;

import java.util.Scanner;

public class TestMethod {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" nhap vao 1 so nguyen : ");
        int n = sc.nextInt();
        
        TestMethod o = new TestMethod();
        
        // trong loi goi ham isPrime() o dong 18, n+3: tham so thuc te (argument)
        if(o.isPrime(n+3)){   
            System.out.printf(" >> %d la so nguyen to \n", n+3);
        }
        else{
            System.out.printf(" >> %d la hop so \n", n+3);
        }
    }
   
    
    /* dinh nghia phuong thuc kiem tra 1 so nguyen co phai la so nguyen to ko ?
        boolean isPrime(int n) : method signature   
        n: tham so hinh thuc (parameter) cung chinh la bien cuc bo cua ham isPrime()
    */
    public boolean isPrime(int n){
        for (int i=2; i <=Math.sqrt(n) ; i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    
    
}
