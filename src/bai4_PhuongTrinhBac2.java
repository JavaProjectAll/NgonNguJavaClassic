import java.util.Scanner;

public class bai4_PhuongTrinhBac2 {
    public static void main(String[] args) {
        //Phương trình ax^2+bx+c =0
        System.out.printf("Phương trình Ax^2 + Bx + C = 0 \n");
        double x;
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        double delta = (B*B) - (4 * A * C);
        if(A == 0){
            x = -C/B;
            System.out.println("Phương trình có 1 nghiệm x = "+x);
        }else{
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm vì delta =" + delta);
            } else if (delta == 0) {
                x = -B / (2 * A);
                System.out.println("Phương trình có 1 nghiệm " + x);
            } else {
                System.out.println("Phương trình có 2 nghiệm phân biệt là ");
                double x1 = (-B + delta) / 2 * A;
                double x2 = (-B - delta) / 2 * A;
                System.out.println("x1 = " + x1 + " x2 = " + x2);
            }
        }
    }
}
