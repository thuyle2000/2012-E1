/*
Demo StringBuilder
 */
package test;

public class TestStringBuilder {

    public static void main(String[] args) {
        System.out.println("Demo StringBuilder");
        StringBuilder sb = new StringBuilder("Nguyen");
        System.out.println("sb = " + sb);
        sb.append(" Xuan Loc");
        System.out.println("After sb.append(..), sb : " + sb );
        sb.insert(7, "thi ");
        System.out.println("After sb.insert(..), sb : " + sb );
        sb.delete(7, 15);
        System.out.println("After sb.delete(7,16), sb : " + sb );
        sb.reverse();
        System.out.println("After sb.reverse, sb : " + sb );
    }
}
