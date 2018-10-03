package bai3;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        //Viết chương trình cho phép nhập vào năm sinh của một người
        // và tính được tuổi của người đó.
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập năm sinh");
        int year = sc.nextInt();
        Calendar today = Calendar.getInstance();
        System.out.println("Tuổi của bạn là " + (today.get(Calendar.YEAR) - year));
    }
}