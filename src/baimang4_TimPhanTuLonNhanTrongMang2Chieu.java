public class baimang4_TimPhanTuLonNhanTrongMang2Chieu {
    public static void main(String[] args) {
        int[][] arrNum = {
                {3, 6, 41, 8, 12, 19},
                {25, 3, 118, 5, 33, 1},
                {235, 30, 18, 52, 13, 2}
        };
        int max = arrNum[0][0];
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < arrNum.length; i++) {
            for (int j = 0; j < arrNum[i].length; j++) {
                if (max < arrNum[i][j]) {
                    max = arrNum[i][j];
                    index1 = i;
                    index2 = j;
                }
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng là "+max+" tại vị trí arrNum["+index1+"]["+index2+"]");
    }
}
