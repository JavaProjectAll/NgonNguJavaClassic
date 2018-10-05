import java.util.Random;

public class baitap14_TimGiaTriNhoNhatTrongPhuongThuc {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] arrNum = new int[10];
        System.out.println("Mảng gồm: ");
        for (int i = 0; i < arrNum.length; i++) {
            arrNum[i] = rd.nextInt(100);
            System.out.println(arrNum[i]);
        }

        int index = minValue(arrNum);
        System.out.println("Giá trị nhỏ nhất trong mảng là "+arrNum[index]+"\n Tại vị trí "+index);
    }

    public static int minValue(int[] arr) {
        int min = arr[0];
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }
        return index;
    }
}
