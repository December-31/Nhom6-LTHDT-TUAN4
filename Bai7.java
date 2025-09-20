import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int x : arr) sum += x;
        System.out.println("Tong = " + sum);
    }
}
