/*
mo ta cau truc tong quat cua 1 doi tuong sinh vien, bao gom:
thuoc tinh : ms, ho ten, nam sinh, gioi tinh, diem thi
 */
package data;
public class Student {
    //khai bao cac field thuoc tinh
    public String id, name;
    public int yob, mark;
    public boolean gender;
    
     
    //dinh nghia ham dung ko tham so (No-argument constructor)
    public Student(){
       id="Student000";
       name="Vo danh";
       yob= 2000;
       mark=40;
       gender=true;
    }
    
    //dinh nghia ham dung co doi so (argument constructor)
    public Student(String id, String name, int ns, int diem, boolean gender){
       yob = ns;
       mark = diem;
       this.id= id;
       this.name = name;
       this.gender = gender; 
    }
    
    
    //ham xuat thong tin chi tiet cua doi tuong sv ra man hinh
    public void output(){
        System.out.printf("id=%s, ten=%s, nam sinh=%d, gioi tinh=%s, diem KQ thi: %d \n" , id, name, yob, gender?"nam":"nu", mark );
    }

    
    //lap trinh lai ham toString() cua lop cha Object, de bieu dien noi dung chi tiet cua dt Student
    @Override
    public String toString() {
        return String.format("id=%s, ten=%s, tuoi=%d, gioi tinh=%s, diem KQ thi: %d" , id, name, 2021-yob, gender?"nam":"nu", mark );
    }
    
    
}
