/*
Rectangle la con cua lop truu tuong Shape:
- hien thuc phep toan tinh dien tich, chu vi, input
- co thuoc tinh dai va rong 
 */
package data;

import java.util.Scanner;

public class Rectangle extends Shape {
    public float length, width;
    
    @Override
    public float getArea() {
        return length * width;
    }

    @Override
    public float getPerimeter() {
        return (length + width) * 2;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap chieu dai: ");
        length = Float.parseFloat(sc.nextLine().trim());
        System.out.print("nhap chieu rong: ");
        width = Float.parseFloat(sc.nextLine().trim());
    }

}
