package bai3;

import java.util.Scanner;

public class bai2 {
    //Viết chương trình nhập một giá trị là độ 0C (Celsius) và chuyển nó sang độ 0F . [Hướng dẫn: C/5 = (F-32)/9]
    // F= 9C/5 +32
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập nhiệt độ C");
        double C = sc.nextDouble();
        double F = (9*C)/5 + 32;
        System.out.println("Nhiệt độ F là "+F);
    }
}
