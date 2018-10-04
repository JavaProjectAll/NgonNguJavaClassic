import java.util.Scanner;

public class baitap12_SoNguyenToNhoHon100 {
    public static void main(String[] args) {
        String so_nguyen_to = "";
        boolean number = false;
        for (int i = 0; i <= 100; i++) {
            if (i <= 1) {
                number = false;
            } else if (i == 2 || i == 3) {
                number = true;
                so_nguyen_to += i + " ";
            } else if (i % 2 == 0) {
                number = false;
            } else if (i >= 4) {
                for (int j = 3; j < (i - 1); j++) {
                    if (i % j == 0) {
                        number = false;
                        break;
                    } else {
                        number = true;
                    }
                }
                if (number) {
                    so_nguyen_to += i + " ";
                }
            }
        }
        System.out.println(so_nguyen_to);
    }
}
