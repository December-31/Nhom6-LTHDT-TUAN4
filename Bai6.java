/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PhanManhTung
 */
import java.util.Scanner;
public class Bai6 
{
    static Scanner sc=new Scanner(System.in);
    static int a,b;
    static void nhap()
    {
        System.out.print("Nhap a va b:");
        a=sc.nextInt();
        b=sc.nextInt();
    }
    static int UCLN(int a,int b)
    {
        while (b!=0)
        {
            int tg=a%b;
            a=b;
            b=tg;
        }
        return Math.abs(a);
    }
    static int BCNN(int a,int b)
    {
        if (a==0||b==0)
            return 0;
        return Math.abs((a*b)/UCLN(a,b));
    }
    static void ketqua()
    {
        System.out.println("Uoc chung lon nhat cua 2 so "+a+" va "+b+" la: "+UCLN(a,b));
        System.out.println("Boi chung nho nhat cua 2 so "+a+" va "+b+" la: "+BCNN(a,b));
    }
    public static void main(String[] args)
    {
        nhap();
        ketqua();
    }
}
