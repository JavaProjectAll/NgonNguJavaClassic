import java.util.Random;
import java.util.Scanner;

public class bai10_UngDungXoSo {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int lottery = rd.nextInt(50);
        String extra = "";
        int guessDigit1, guessDigit2;
        System.out.println("Khách hàng 1 nhập số may mắn <=50");
        guessDigit1 = sc.nextInt();
        System.out.println("Khách hàng 2 nhập số may mắn <=50");
        guessDigit2 = sc.nextInt();
        System.out.println("Số độc đặc là 0" + lottery);
        String s = Integer.toString(lottery);
        for (int i = s.length() - 1; i >= 0; i--) {
            extra += s.charAt(i);
        }
        if (lottery<10){
            extra += "0";
        }

        if (lottery == guessDigit1) {
            System.out.println("Khách hàng 1 Đoán đúng số may mắn là " + guessDigit1);
            System.out.println("Khách hàng 1 đã trúng độc đặc 3000$");
        } else if (Integer.parseInt(extra) == guessDigit1) {
            System.out.println("Khách hàng 1 Đoán gần đúng số may mắn là " + guessDigit1);
            System.out.println("Khách hàng 1 Bạn đã trúng độc đặc 1000$");
        } else {
            System.out.println("Khách hàng 1 Bạn đã đoán sai");
        }

        if (lottery == guessDigit2) {
            System.out.println("Khách hàng 2 Đoán đúng số may mắn là " + guessDigit2);
            System.out.println("Khách hàng 2 Bạn đã trúng độc đặc 3000$");
        } else if (Integer.parseInt(extra) == guessDigit2) {
            System.out.println("Khách hàng 2 Đoán gần đúng số may mắn là " + guessDigit2);
            System.out.println("Khách hàng 2 Bạn đã trúng độc đặc 1000$");
        } else {
            System.out.println("Khách hàng 2 Bạn đã đoán sai");
        }
    }
}
