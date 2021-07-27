/*
    demo vong lap while
 */
package demo_loop;

import java.util.Random;
import java.util.Scanner;

public class Demo_while {

    public static void main(String[] args) {
        
        Random r = new Random();
        int maso = 1+ r.nextInt(5);
        
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        int input=0;
        
        while (input != maso){
            System.out.print(" >> Nhap ma so bi mat [1-6]: ");
            input = sc.nextInt();
            counter++;
        }
        
        System.out.printf(">> Ban da mat %d lan de tim ra ma so bi mat \n", counter);
    }
    
}
