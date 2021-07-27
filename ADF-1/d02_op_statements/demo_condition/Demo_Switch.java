/*
Tinh so ngay trong thang
 */
package demo_condition;

import java.util.Scanner;

public class Demo_Switch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Vui long nhap thang [1-12]: ");
        int mm = sc.nextInt();
        int dd;
        switch(mm){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: dd=31; break;
            
            case 4:
            case 6:
            case 9:
            case 11: dd=30; break;
            
            case 2:
                dd=28; break;
            default:
                System.out.println("Thang ko hop le !");
                return;           
        }
        
        System.out.printf(" >> thang %d co %d ngay ! \n", mm, dd);
    }
    
}
