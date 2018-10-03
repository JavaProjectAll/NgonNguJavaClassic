package bai3;

import java.util.Scanner;

public class bai1 {
    //Viết chương trình nhập điểm của một sinh viên cho các môn: Vật lý, Hóa học, và Sinh học.
    // Sau đó hiển thị điểm trung bình và tổng của những điểm này
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập điểm Lý");
        double ly = sc.nextDouble();
        System.out.println("Nhập điểm Hóa");
        double hoa = sc.nextDouble();
        System.out.println("Nhập điểm Sinh");
        double sinh = sc.nextDouble();
        double diemTB = (ly + hoa + sinh) / 3;
        System.out.println("Điểm trung bình là " + diemTB);
    }
}
