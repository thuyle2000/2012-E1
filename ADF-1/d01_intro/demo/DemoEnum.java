/*
demo enumeration
 */
package demo;

public class DemoEnum {
    enum DayOfWeek{
        Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
    }
    
    public static void main(String[] args) {
        DayOfWeek today = DayOfWeek.Saturday;
        System.out.println("Today is " + today);
    }
    
}
