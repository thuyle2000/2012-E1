/*
Circle la con cua lop truu tuong Shape:
- hien thuc phep toan tinh dien tich, chu vi, input
- co thuoc tinh ban kinh 
 */
package data;

import java.util.Scanner;

public class Circle extends Shape{
    public float r;
    
    @Override
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ban kinh: ");
        r = Float.parseFloat(sc.nextLine().trim());
    }

    @Override
    public float getArea() {
        return PI*r*r;
    }

    @Override
    public float getPerimeter() {
        return 2*PI*r;
    }
}
