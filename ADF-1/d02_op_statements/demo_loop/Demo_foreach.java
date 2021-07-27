/*
demo foreach - duyet cac phan tu ben trong 1 mang
 */
package demo_loop;


public class Demo_foreach {

    public static void main(String[] args) {
        //khai bao 1 mang [ds] chua ho ten cua cac sv
        String[] ds = {"Hung Anh","Ngoc Son", "Duy Hung", "Le Quan","Gia Huy", "Xuan Loc", "Pham Vinh"};
        
        System.out.println(">> Danh sach sinh vien <<");
        for (String tensv : ds) {
            System.out.println(tensv);
        }
        
    }
    
}
