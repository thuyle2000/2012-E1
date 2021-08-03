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
    final int max = 10;

    //khai bao mang ds[] chua danh sach nhan vien
    Employee[] ds = new Employee[max];

    //khai bao bien dem so nv dang luu tru trong mang ds[]
    int count = 0;

    //dinh nghia ham them 1 nv moi, va luu vo mang ds[]
    public void add() {
        //kiem tra mang ds[] co con bo nho trong ko
        if (count == max) {
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
    public void display() {
        if (count == 0) {
            System.out.println(" >> HT chua co du lieu !!!");
            return;
        }
        System.out.println("Ten cong ty: " + Employee.company);
        System.out.println("Dia chi: " + Employee.address);
        System.out.println("Danh sach nhan vien");
        for (int i = 0; i < count; i++) {
            System.out.println(ds[i]);
        }
    }

    //ham xoa 1 nhan vien ra khoi danh sach
    public void remove(String ms) {
        if (count == 0) {
            System.out.println(" >> HT chua co du lieu !!!");
            return;
        }

        for (int i = 0; i < count; i++) {
            if (ds[i].id.equals(ms)) {
                //day la nhan vien co ma so muon xoa-
                //don gian dich chuyen cac dong ben duoi len 1 vi tri
                for (int j = i + 1; j < count; j++) {
                    ds[j - 1] = ds[j];
                }
                System.out.printf(" >> Da xoa nv co id=[%s] ! \n", ms);

                //giam bien dem
                count--;
                return;
            }
        }
        System.out.println(" >> Ko tim thay nv muon xoa !!!");
    }

    //ham tim nhan vien theo ten 
    public void display(String ten) {
        if (count == 0) {
            System.out.println(" >> HT chua co du lieu !!!");
            return;
        }
        
        int demTen=0;
        for (int i = 0; i < count; i++) {
            if(ds[i].name.contains(ten)){
                System.out.println(ds[i]);
                demTen++;
            }
        }//ket thuc FOR
        
        if(demTen==0){
            System.out.println(" >> Ko tim thay !!! ");
        }
        else{
            System.out.printf("Tim thay (%d) nhan vien co ten [%s]\n", demTen,ten);
        }

    }

}
