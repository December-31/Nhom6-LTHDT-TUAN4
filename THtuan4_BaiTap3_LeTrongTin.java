/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author LeTrongTIn
 */
import java.util.Scanner;
public class THtuan4_BaiTap3_LeTrongTin 
{
    static Scanner sc = new Scanner(System.in);
    static float a,b;
    static void Nhap()
    {
        System.out.println("Nhap lan luot 2 gia tri: ");
        System.out.print("a = ");
        a = sc.nextFloat();
        System.out.print("b = ");
        b = sc.nextFloat();
    }
    static float tong(float a, float b)
    {
        return a+b;
    }
    static float hieu(float a, float b)
    {
        return a-b;
    }
    static float tich(float a, float b)
    {
        return a*b;
    }
    static Float thuong(float a, float b)
    {
        if (b==0)
            return null;
        else
            return a/b;
    }
    static void In(int opt, float a, float b)
    {
        switch(opt)
        {
            case 1: System.out.println("Tong 2 so "+a+" va "+b+" la: "+ tong(a,b)); break;
            case 2: System.out.println("Hieu 2 so "+a+" va "+b+" la: "+ hieu(a,b)); break;
            case 3: System.out.println("Tich 2 so "+a+" va "+b+" la: "+ tich(a,b)); break;
            case 4:
                if (thuong(a,b)==null)
                    System.out.println("Mau bang 0, khong tinh duoc.");
                else 
                    System.out.println("Thuong 2 so "+a+" va "+b+" la: "+ thuong(a,b));
                break;
            default: System.out.println("Lua chon khong hop le."); break;
        }
    }
    static void Menu()
    {
        int opt;
        System.out.println("-----*Menu*-----");
        System.out.println("1. Phep cong");
        System.out.println("2. Phep tru");
        System.out.println("3. Phep nhan");
        System.out.println("4. Phep chia");
        opt=sc.nextInt();     
        In(opt,a,b);
    }
    public static void main(String args[]) 
    {
       Nhap();
       Menu();
    }
}