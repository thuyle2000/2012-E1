/*
kiem thu ve phuong thuc co danh so tham so dong
 */
package test;

public class TestMethodVariableArg {

    public static void main(String[] args) {
        TestMethodVariableArg o = new TestMethodVariableArg();
        int sum = o.sum(10, 20, 30);
        System.out.println("Tong (10,20,30)= " + sum );
        System.out.println("Tong (10,20,30,40)= " + o.sum(10,20,30,40) );
        System.out.println("Tong (10,20,30,40,50,60)= "+o.sum(10,20,30,40,50, 60) );
        System.out.println("Tong (10,20) = " + o.sum(10,20) );            
    }   
    
    public int sum(int a, int b){
        return a+b;
    }
    
    public int sum(int ... number){
        int total = 0;
        for (int n : number) {
            total+=n;
        }
        return total;
    }
}
