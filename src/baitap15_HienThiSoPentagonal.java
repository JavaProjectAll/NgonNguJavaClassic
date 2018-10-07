import java.util.Scanner;

public class baitap15_HienThiSoPentagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập 1 số kiểm tra Pentagonal");
        int number = sc.nextInt();
        boolean check = isPentagonalNumber(number);
        if (check) {
            System.out.println(number + " là số Pentagonal");
        } else {
            System.out.println(number + " không phải số Pentagonal");
        }
    }

    public static boolean isPentagonalNumber(int n) {
        if (n > 0) {
            int m;
            int i = 0;
            do {
                m = (3 * i * i - i) / 2;
                i++;
            } while (m < n);
            return (m == n);
        }
        return false;
    }
}
