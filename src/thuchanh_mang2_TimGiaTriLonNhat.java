import java.util.Random;
import java.util.Scanner;

public class thuchanh_mang2_TimGiaTriLonNhat {
    public static void main(String[] args) {
        int size;
        int[] array;
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập kích cỡ mảng < 20");
            size = sc.nextInt();
            if (size>20){
                System.out.println("Vượt quá 20 phần tử hãy nhập lại");
            }
        }while (size>20);
        array = new int[size];
        for (int i=0;i<array.length;i++){
            array[i] = rd.nextInt(100);
        }
        System.out.println("Danh sách dẫy số gồm :");
        for (int num : array){
            System.out.println(num + "\t");
        }
        int max = array[0];
        int index=0;
        for (int i=0;i<array.length;i++){
            if(max<array[i]){
                max=array[i];
                index = i;
            }
        }
        System.out.println("Số lớn nhất trong mảng là "+max+" ở vị trí "+index);
    }
}
