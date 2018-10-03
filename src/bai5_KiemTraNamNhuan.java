import java.util.Scanner;

public class bai5_KiemTraNamNhuan {
    public static void main(String[] args) {
        //bài kiểm tra năm nhuận
        System.out.println("Nhập năm kiểm tra");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year%100 == 0 && year%400 == 0){
            if (year%4 == 0){
                if (year%100 != 0){
                    System.out.println(year+" là năm nhuận");
                }else{
                    System.out.println(year+" ko phải năm nhuận");
                }
            }else{
                System.out.println(year+" ko phải năm nhuận");
            }
        }else{
            System.out.println(year+" ko phải năm nhuận");
        }
    }
}
