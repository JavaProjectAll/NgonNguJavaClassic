import java.util.Scanner;

public class thuchanh4_TimUocChungLonNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        int min;
        if (a < b) {
            min = a;
        }else{
            min = b;
        }
        int UCLN = 1;
        for (int i = 1; i<=min; i++){
            if(a%i == 0 && b%i==0){
                if (i>UCLN){
                    UCLN = i;
                }
            }
        }
        System.out.println("Ước chung lớn nhất của "+a+" và "+b+" là "+UCLN);
    }
}
