import java.util.Random;
import java.util.Scanner;

public class bai11_UngDungDocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Random rd = new Random();
        int num = scanner.nextInt();
        String strNum = Integer.toString(num);
        switch (num){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nice");
                break;
            case 10:
                System.out.println("Ten");
                break;
            case 11:
                System.out.println("Eleven");
                break;
            case 12:
                System.out.println("Twelve");
                break;
            case 13:
                System.out.println("thirteen");
                break;
        }
    }
}
