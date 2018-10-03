package bai3;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        //Viết chương trình tính diện tích và chu vi hình tròn.
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập bán kính hình tròn");
        double radius = sc.nextDouble();
        double perimeter = radius * 2 * Math.PI;
        double acreage = radius * radius * Math.PI;
        System.out.println("Chu vi hình tròn là " + perimeter);
        System.out.println("Chu vi hình tròn là " + acreage);
    }
}
