/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PhanManhTung
 */
import java.util.Scanner;
public class Bai3 
{
    static Scanner sc=new Scanner(System.in);
    static int a,b;
    static void nhap()
    {
        System.out.print("Nhap a va b:");
        a=sc.nextInt();
        b=sc.nextInt();
    }
    static int tong(int a,int b)
    {
        return a+b;
    }
    static int hieu(int a,int b)
    {
        return a-b;
    }
    static int tich(int a,int b)
    {
        return a*b;
    }
    static void thuong()
    {
        float thuong;
        if (b!=0)
        {
           thuong=(float)a/b;
            System.out.println("Thuong 2 so la:"+thuong);
        }
        else
             System.out.println("Khong tinh duoc");
    }
    static void menu(int item,int a,int b)
    {
        switch(item)
        {
            case 1: 
                    System.out.println("Tong 2 so la:"+tong(a,b));
                    break;
            case 2: 
                    System.out.println("Hieu 2 so la:"+hieu(a,b));
                    break;
            case 3: 
                    System.out.println("Tich 2 so la:"+tich(a,b));
                    break;
            case 4: 
                    thuong();
                    break;
            default:System.out.println("Nhap sai nhap lai");
        }
    }
    public static void main(String[] args)
    {
        nhap();
        int item;
        char c;
        do
        {
            System.out.println("---MENU---");
            System.out.println("1.Tinh tong");
            System.out.println("2.Tinh hieu");
            System.out.println("3.Tinh tich");
            System.out.println("4.Tinh thuong");
            item=sc.nextInt();
            menu(item,a,b);
            sc.nextLine();
            System.out.println("Nhap y de tiep tuc hoac phim bat ky de thoat");
            c=sc.nextLine().charAt(0);
        }
        while (c=='y');
    }
}
