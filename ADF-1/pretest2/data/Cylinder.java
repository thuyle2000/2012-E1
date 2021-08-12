package data;

import java.util.Scanner;

public class Cylinder extends Shape implements IGeometry {

    public float radius, height;

    public Cylinder() {
    }

    public Cylinder(float radius, float height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public void accept() {
        Scanner sc = new Scanner(System.in);

        //nhap ban kinh
        while (true) {
            try {
                System.out.print(" nhap ban kinh hinh khoi tru : ");
                radius= Float.parseFloat(sc.nextLine().trim());
                if (radius> 0 ) {
                    break;  //ban kinh hop le => ket thuc vong lap nhap lieu
                }
                System.out.println(" >> Loi: ban kinh ko hop le !!! ");
            } catch (Exception e) {
                System.out.println(" >> Loi: " + e.getMessage());
            }
        }
        
        //nhap chieu cao
        while (true) {
            try {
                System.out.print(" nhap chieu cao hinh khoi tru : ");
                height= Float.parseFloat(sc.nextLine().trim());
                if (height> 0 ) {
                    break;  //chieu cao hop le => ket thuc vong lap nhap lieu
                }
                System.out.println(" >> Loi: chieu cao ko hop le !!! ");
            } catch (Exception e) {
                System.out.println(" >> Loi: " + e.getMessage());
            }
        }
        
    }

    @Override
    public void pintInfo() {
        System.out.println(" >> Thong tin chi tiet cua hinh khoi tru <<");
        System.out.printf(" - ban kinh : % .2f \n", radius);
        System.out.printf(" - chieu cao : % .2f \n", height);
        System.out.printf(" - chu vi : % .2f \n", peripheral());
        System.out.printf(" - dien tich : % .2f \n", area());
        System.out.printf(" - the tich : % .2f \n", volume());
    }

    @Override
    public String toString() {
        return String.format("%6.2f, %6.2f, %9.2f, %9.2f, %9.2f", 
            radius, height,peripheral(), area(), volume() );
    }
    
    

    @Override
    public float area() {
        return PI * radius *radius;
    }

    @Override
    public float peripheral() {
        return 2 * PI *radius;
    }

    @Override
    public float volume() {
       return area()*height;
    }

}
