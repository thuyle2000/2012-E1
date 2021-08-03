/*
Lop quan ly danh sach nhan vien trong bien mang (array), bao gom chuc nang
- them nhan vien moi
- in danh sach nhan vien
- tim kiem nhan vien
- xoa nhan vien
...
 */
package data;

public class EmployeeArray {
    
    //khai bao hang so max: so luong nv toi da co the luu trong mang ds[]
    final int max = 3;
    
    //khai bao mang ds[] chua danh sach nhan vien
    Employee[] ds = new Employee[max];
    
    //khai bao bien dem so nv dang luu tru trong mang ds[]
    int count=0;
    
    //dinh nghia ham them 1 nv moi, va luu vo mang ds[]
    public void add(){
        //kiem tra mang ds[] co con bo nho trong ko
        if(count==max){
            System.out.println(" >> HT ko con bo nho !!! Tu choi them moi !!!");
            return;
        }
        
        //tao 1 doi tuong nv
        Employee e = new Employee();
        e.input();
        
        //luu vo mang ds[]
        ds[count] = e;
        
        //tang bien dem count
        count++;
    }
    
    //ham in danh sach nhan vien trong mang ds[]
    public void display(){
        if(count == 0){
            System.out.println(" >> HT chua co du lieu !!!");
            return;
        }
        
        System.out.println("Danh sach nhan vien");
        for(int i=0; i<count ; i++){
            System.out.println(ds[i]);
        }
    }
    

}
