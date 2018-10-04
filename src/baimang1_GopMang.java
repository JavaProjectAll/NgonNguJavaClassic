public class baimang1_GopMang {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9};
        int size = arr1.length + arr2.length;
        int num =0;
        int[] arr3 = new int[size];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = arr1.length; i < size; i++) {
            arr3[i] = arr2[num];
            num++;
        }
        for (int a : arr3){
            System.out.println(a);
        }
    }
}
