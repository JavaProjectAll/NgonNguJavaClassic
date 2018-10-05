public class baitap17_SapXepSo {
    public static void main(String[] args) {
        double[] arr = displaySortedNumbers(10, 12.5, 8.5);
        for (double num : arr) {
            System.out.println(num);
        }
    }

    public static double[] displaySortedNumbers(double num1, double num2, double num3) {
        double[] arrNum = {num1, num2, num3};
        double backup;
        for (int i = 0; i < arrNum.length - 1; i++) {
            for (int j = 1; j < arrNum.length; j++) {
                if (arrNum[i] > arrNum[j]) {
                    backup = arrNum[i];
                    arrNum[i] = arrNum[j];
                    arrNum[j] = backup;
                    j++;
                }
            }
        }
        return arrNum;
    }

}
