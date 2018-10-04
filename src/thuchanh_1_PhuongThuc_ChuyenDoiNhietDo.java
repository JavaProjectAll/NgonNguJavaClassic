import java.util.Scanner;

public class thuchanh_1_PhuongThuc_ChuyenDoiNhietDo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double F, C;
        int choice;
        do {
            System.out.println("MENU");
            System.out.println("1> Chuyển từ độ C => độ F");
            System.out.println("2> Chuyển từ độ F => độ C");
            System.out.println("0> Thoát chương trình");
            choice = sc.nextInt();
            if (choice <0 || choice>2) System.out.println("Chọn lại yêu cầu");
            switch (choice) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("Nhập độ C chuyển sang độ F ");
                    C = sc.nextDouble();
                    F = convertCtoF(C);
                    System.out.println("Nhiệt độ "+C+"*C = "+F+"*F");
                    break;
                case 2:
                    System.out.println("Nhập độ F chuyển sang độ C ");
                    F = sc.nextDouble();
                    C = convertFtoC(F);
                    System.out.println("Nhiệt độ "+F+"*F = "+C+"*C");
                    break;
            }
        } while (choice < 0 || choice > 2);
    }

    public static double convertFtoC(double F) {
        double C = (5.0 / 9) * (F - 32);
        return C;
    }

    public static double convertCtoF(double C) {
        double F = (5.0 / 9) * C + 32;
        return F;
    }
}
