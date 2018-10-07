import java.util.Date;
import java.util.Scanner;

public class baitap_HienThiNgayTuNamXXXXdenYYYY {
    public static int numberOfDaysInAYear(int year) {
        int day = 0;
        for (int i = year; i <= 2018; i++) {
            if (i % 4 == 0) day += 366;
            day += 365;
        }
        return day;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập năm để kiểm tra số ngày từ năm đó đến giờ");
        int year = sc.nextInt();
        int day = numberOfDaysInAYear(year);
        System.out.println("Từ năm " + year + " đến 2018 có tổng cộng " + day + " ngày");
    }
}
