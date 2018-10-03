import java.util.Scanner;

public class thuchanh1_TinhChiSoCanNang {
    public static void main(String[] args) {
        double height, weight, bmi;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập cân nặng (Kg)");
        weight = scanner.nextDouble();
        System.out.print("Nhập chiều cao (cm)");
        height = scanner.nextDouble();
        bmi = weight / Math.pow((height/100), 2);
        if (bmi < 18)
            System.out.printf("Chỉ số BMI là %-20.2f%s", bmi, "Gầy");
        else if (bmi < 25.0)
            System.out.printf("Chỉ số BMI là %-20.2f%s", bmi, "Bình thường");
        else if (bmi < 30.0)
            System.out.printf("Chỉ số BMI là %-20.2f%s", bmi, "Hơi béo");
        else
            System.out.printf("Chỉ số BMI là %-20.2f%s", bmi, "Quá béo");
    }
}
