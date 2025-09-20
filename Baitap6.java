import java.util.Scanner;
public class Baitap6 {
    public static int ucln(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a); 
    }
    public static int bcnn(int a, int b) {
        return Math.abs(a * b) / ucln(a, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên thứ nhất: ");
        int a = sc.nextInt();
        System.out.print("Nhập số nguyên thứ hai: ");
        int b = sc.nextInt();
        int UCLN = ucln(a, b);
        int BCNN = bcnn(a, b);
        System.out.println("UCLN của " + a + " và " + b + " là: " + UCLN);
        System.out.println("BCNN của " + a + " và " + b + " là: " + BCNN);
        sc.close();
    }
}
