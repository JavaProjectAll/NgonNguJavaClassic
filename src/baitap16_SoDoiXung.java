import java.util.Scanner;

public class baitap16_SoDoiXung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (reverse(num)) {
            System.out.println(num + " là số đối xứng");
        } else {
            System.out.println(num + " không phải là số đối xứng");
        }
    }

    public static boolean reverse(int number) {
        boolean check = false;
        String strNum = Integer.toString(number);
        int j = strNum.length()-1;
        for (int i = 0; i < strNum.length()/2; i++) {
            if (strNum.charAt(i) == strNum.charAt(j)) {
                check = true;
                j--;
            } else {
                return check = false;
            }
        }
        return check;
    }
}
