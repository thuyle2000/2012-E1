/*
Mo ta 1 doi tuong hinh hoc bat ky, co thuoc tinh
- hang so PI=3.14
- phuong thuc truu tuong: tinh dien tich va chu vi
- lap trinh lai toString()
 */
package data;

public abstract class Shape {
    public final float PI = 3.1415f;
    
    public abstract float getArea();
    public abstract float getPerimeter();
    public abstract void input();

    @Override
    public String toString() {
        return String.format(" DT=%8.2f, CV=%8.2f", getArea(), getPerimeter());
    }
    
}
