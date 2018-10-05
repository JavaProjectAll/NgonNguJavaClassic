public class baitap18_KiemTraSoNguyenToNhoHon1000 {
    public static void main(String[] args) {
        for (int i = 0; i <= 1000; i++) {
            if (isPrime(i)) {
                System.out.println(i + " là số nguyên tố");
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
