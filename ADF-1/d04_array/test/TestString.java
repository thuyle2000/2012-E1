/*
Demo cac ham xu ly chuoi 
 */

package test;

public class TestString {

    public static void main(String[] args) {
        String s1 = "Nguyen Xuan Loc, Nguyen Ngoc Son, ";
        String s2 = "Hung Anh";
        String s4 = "Nguyen";
        String s3 = s1.concat(s2);
        
//        System.out.println(s3); 
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s4 = " + s4);
        System.out.println("so sanh s1, s1: " + s1.compareTo(s1));
        System.out.println(" tim kiem s4 trong s1 (indexOf) " + s1.indexOf(s4));
        System.out.println(" tim kiem s4 trong s1 (lastIndexOf) " + s1.lastIndexOf(s4));
        System.out.println(" tim kiem s2 trong s1 (indexOf) " + s1.indexOf(s2));
        System.out.println(" s1.replace('Nguyen','Do'): " + s1.replace("Nguyen", "Do"));
        System.out.println(" s1.substr(17):" + s1.substring(17));
        System.out.println("so ky tu cua s1 : " + s1.length());
        
    }
    
}
