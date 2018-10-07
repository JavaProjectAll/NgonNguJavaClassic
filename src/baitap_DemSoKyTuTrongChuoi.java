import java.util.Scanner;

public class baitap_DemSoKyTuTrongChuoi {
    public static void main(String[] args) {
        System.out.println("Nhập một chuỗi bất kỳ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Số ký tự trọng chuỗi là "+countLetters(str));
    }

    public static int countLetters(String s) {
        return s.length();
    }
}
