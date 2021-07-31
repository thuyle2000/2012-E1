/*
demo mang so nguyen 2 chieu: ma tran n-dong, m-cot
 */
package test;

public class TestArray2D {

    public static void main(String[] args) {
        //khai bao mang 2 chieu 3x4 [a] (gom 3 dong, 4 cot)
        int[][] a = {{1, 2, 3, 4}, {7, 8, 9, 6}, {5, 4, 4, 2}};

        //khai bao mang 2 chieu 3x4 [b] (gom 3 dong, 4 cot)
        int[][] b = {{5, 6, 9, 64}, {17, 82, 39, 6}, {25, 43, 14, 62}};

        //in mang [a] ra man hinh
        System.out.println("\n Mang A");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf(" %3d ", a[i][j]);
            }
            System.out.println(""); // xuong hang cho moi dong
        }

        System.out.println("\n Mang B");
        //in mang [b] ra man hinh
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf(" %3d ", b[i][j]);
            }
            System.out.println(""); // xuong hang cho moi dong
        }
        
         System.out.println("\n Mang c = A+B");
        //in mang [b] ra man hinh
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf(" %3d ", b[i][j] + a[i][j]);
            }
            System.out.println(""); // xuong hang cho moi dong
        }               
    }
}
