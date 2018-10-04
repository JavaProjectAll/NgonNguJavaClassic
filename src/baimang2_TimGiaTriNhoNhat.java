import java.util.Random;
import java.util.Scanner;

public class baimang2_TimGiaTriNhoNhat {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        do {
            System.out.println("Nhập vào số phần từ trong mảng");
            size = sc.nextInt();
        }while (size>100);
        arr = new int[size];
        for (int i=0;i<arr.length;i++){
            arr[i] = rd.nextInt(100);
            System.out.println(arr[i]);
        }
        int min = arr[0];
        int index = 0;
        for (int i=1;i<arr.length;i++){
            if(min>arr[i]){
                min = arr[i];
                index = i;
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng là "+min+" tại vị trí "+index);
    }
}
