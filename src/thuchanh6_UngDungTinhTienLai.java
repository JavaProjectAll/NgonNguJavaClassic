import java.util.Scanner;

public class thuchanh6_UngDungTinhTienLai {
    public static void main(String[] args) {
        double money;
        int month;
        double interset_rate = 5.5;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số tiền: ");
        money = input.nextDouble();
        System.out.println("Nhập số tháng gửi: ");
        month = input.nextInt();
        double interest = 0;
        for (int i = 0; i < month; i++) {
            interest += money * ((interset_rate/12)/100);
        }
        System.out.println("Tổng tiền lãi là " + interest);
    }
}
