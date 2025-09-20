import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao mot so nguyen: ");
        int x = sc.nextInt();
        if (x > 0) {
            System.out.println("So duong");
        } else if (x < 0) {
            System.out.println("So am");
        } else {
            System.out.println("So 0");
        }
    }
}
