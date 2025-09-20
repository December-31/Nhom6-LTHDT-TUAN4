
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author LeTrongTin
 */
import java.util.Scanner;
public class THtuan4_BaiTap5_LeTrongTin 
{
    static Scanner sc = new Scanner(System.in);
    static int a;
    static void Nhap()
    {
        System.out.println("Nhap vao 1 so nguyen: ");
        System.out.print("a = ");
        a = sc.nextInt();
    }
    static int ktra(int a)
    {
        int i, dem=0;
        for (i=1;i<=a;i++)
            if (a%i==0)
                dem++;
        if (dem==2)
            return 1;
        else
            return 0;
    }
    static void In()
    {
        if (ktra(a)==1)
            System.out.print("So "+a+" la so nguyen to.");
        else
            System.out.print("So "+a+" khong phai la so nguyen to.");
    }
    public static void main(String args[]) 
    {
        Nhap();
        In();
    }
}
