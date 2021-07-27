/*
demo phep toan dieu kien 3 ngoi (tam phan)
 */
package demo_op;

import java.util.Scanner;

public class Demo_Ternary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" nhap so nguyen thu 1: ");
        int n1 = sc.nextInt();

        System.out.print(" nhap so nguyen thu 2: ");
        int n2 = sc.nextInt();

        int max = (n1 > n2) ? n1 : n2;
        System.out.printf(" Max(%d, %d) : %d \n", n1, n2, max);

        float a = 21.3476f;
        int b = (int)a + 5;
        
        int x =10, y=3;
        System.out.printf(" %d / %d = %f \n", x, y , (float)x/y);

    }

}
