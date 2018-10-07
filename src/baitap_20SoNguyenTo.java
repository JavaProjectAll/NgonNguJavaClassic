public class baitap_20SoNguyenTo {
    public static void main(String[] args) {
        int count = 0;
        System.out.print("20 Số nguyên tố gồm: ");
        for (int i = 0; ; i++) {
            if (isPrime(i)) {
                count++;
                System.out.print(i+" ");
                if (count == 20){
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int number) {
        boolean check = false;
        if (number < 2) {
            return false;
        } else if (number == 2 || number == 3) {
            return true;
        } else if (number%2 == 0){
            return false;
        }else{
            for (int i = 3;i<number;i+=2){
                if (number%i == 0){
                    return false;
                }
            }
            return true;
        }
    }
}
