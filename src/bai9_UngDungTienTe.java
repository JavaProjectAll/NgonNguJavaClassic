import java.util.Scanner;

public class bai9_UngDungTienTe {
    public static void main(String[] args) {
        double usd, vnd;
        System.out.println("Tỷ giá chuyển đổi là 23000 VND / 1 USD");
        System.out.println("Nhập số Usd cần chuyển đổi \n");
        Scanner sc = new Scanner(System.in);
        usd = sc.nextDouble();
        vnd = usd * 23000;
        System.out.println("Số tiền VND của bạn là " + vnd+ " VND");
    }
}
