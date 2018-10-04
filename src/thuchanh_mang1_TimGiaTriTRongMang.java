import java.util.Scanner;

public class thuchanh_mang1_TimGiaTriTRongMang {
    public static void main(String[] args) {
        boolean isExit = false;
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        for (int i = 0; i < students.length; i++) {
            if(students[i].equals(name)){
                System.out.println("Có tên học sinh trong lớp ở vị trí "+(i+1));
                isExit = true;
            }
        }
        if (!isExit){
            System.out.println("Không tìm thấy tên học sinh đó");
        }
    }
}