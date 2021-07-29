/*
mo ta cau truc du lieu nhan vien, bao gom:
thuoc tinh: ma so, ten, chuc vu, luong cb
 */
package data;

public class Employee {
    public String id;
    protected String name;
    String position;
    private int salary;
    
    //ham dung ko tham so
    public Employee(){
        id="E01";
        name ="Hung Anh";
        position= "Security";
        salary=1000;
    }

    //ham dung co tham so
    public Employee(String id, String name, String position, int salary) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    //ham print() ko tham so
    public void print(){
        System.out.println("Thong tin nhan vien");
        System.out.println("id = " + id);
        System.out.println("ten = "+ name);
        System.out.println("chuc vu = "+position);
        System.out.println("luong cb = " + salary);
    }
    
    //ham print() co 1 tham so - hay dc goi la overloading method
    public void print(String id){
        if(id.equals(this.id)){
            System.out.println("Luong cb = " + salary);
        }else{
            System.out.println("ma so khong hop le !");
        }
    }
    
    
}
