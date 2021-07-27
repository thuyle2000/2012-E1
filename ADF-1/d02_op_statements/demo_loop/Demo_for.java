/*
demo for - tinh giai thua cua 1 so nguyen
 */
package demo_loop;

import java.util.Scanner;

public class Demo_for {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        int n=0;
        //vong lap kiem tra so nhap vo n co nam trong [0-20] ?
        do{
            System.out.print(">> vui long nhap so nguyen [0-20]: ");
            n = sc.nextInt();
        }while(n<0 || n>20);
        
        long gt=1;
        for(int i=1; i<=n; i++){
            gt *= i;  //gt = gt*i;
        }
        
        System.out.printf(" >> %d! = %d \n", n, gt);
    }
}
