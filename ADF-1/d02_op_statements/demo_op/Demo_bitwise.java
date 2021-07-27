/*
demo phep toan luan ly nhi phan va phep toan dk 3 ngoi
 */
package demo_op;

import java.util.Scanner;

public class Demo_bitwise {

    public static void main(String[] args) {
        System.out.println("Demo");
        
        demoBitwise();
    }
    
    //demo phep toan luan ly nhi phan
    static void demoBitwise(){
        //tao 1 bien doi tuong [sc] co kieu la [Scanner]
        Scanner sc ;
        
        //khoi tao bo nho cho bien doi tuong [sc]
        sc = new Scanner(System.in);
        
        //xuat tb len man hinh, yeu cau nguoi chay ct nhap so nguyen thu 1
        System.out.print(" *** nhap so nguyen thu 1: ");
        
        //cho nhap 1 so nguyen, bang ham nextInt() cua dt [sc], roi luu vo bien [n1]
        int n1 = sc.nextInt();
        
         //xuat tb len man hinh, yeu cau nguoi chay ct nhap so nguyen thu 2
        System.out.print(" *** nhap so nguyen thu 2: ");
        int n2 = sc.nextInt();
        
        // thuc hien phep toan bitwise-AND giua 2 so [n1] va [n2], ket qua luu vo [n3]
        int n3 = n1 & n2;  
        
        //in [n3] ra man hinh
        System.out.printf(" %d & %d = %d \n", n1, n2, n3 );
        System.out.printf(" %d | %d = %d \n", n1, n2, n1|n2 );
        System.out.printf(" %d ^ %d = %d \n", n1, n2, n1^n2 );
        System.out.printf(" %d >> 2 = %d \n", n1, n1>>2 );
    }
}
