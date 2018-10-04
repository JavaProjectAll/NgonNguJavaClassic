public class baitap13_hienThiCacLoaiHinh {
    public static void main(String[] args) {
        String str = "";
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                str += "*";
            }
            str += "\n";
        }
        System.out.println(str);

        str = "";
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 8; j++) {
                str += "*";
            }
            str += "\n";
        }
        System.out.println(str);
        str = "";
        for (int i = 5; i > 0; i--) {
            for (int j = i; j >0; j--) {
                str += "*";
            }
            str += "\n";
        }
        System.out.println(str);
    }
}
