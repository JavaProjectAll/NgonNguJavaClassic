import java.util.Scanner;

public class baimang3_ThemPhanTuVaoTrongMang {
    public static void main(String[] args) {
        int[] arrNum = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int X = 100000;
        System.out.println("Nhập vị trí cần chèn phần tử X");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        if (size <= 1 || size > arrNum.length) {
            System.out.println("không chèn được phần tử vào mảng");
        } else {
            for (int i = 2; i < arrNum.length; i++) {
                arrNum[size] = X;
            }
        }
        for (int num : arrNum){
            System.out.println(num);
        }
    }
}
