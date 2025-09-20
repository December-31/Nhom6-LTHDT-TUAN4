/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PhanManhTung
 */
import java.util.Scanner;
public class Bai8 
{
    static Scanner sc=new Scanner(System.in);
    static int[] a;
    static int n;
    static void nhap()
    {
        System.out.println("Nhap so luong phan tu cua mang:");
        n=sc.nextInt();
        a=new int[n+1];
        for (int i=1;i<=n;i++)
        {
            System.out.print("a["+i+"]=");
            a[i]=sc.nextInt();
        }
    }
    static void xuat()
    {
        System.out.println("Mang la:");
        for (int i=1;i<=n;i++)
            System.out.println("a["+i+"]="+a[i]);
        
    }
    static void timkiemmax()
    {
        int demmax=0;
        int phantu=a[1];
        for (int i=1;i<=n;i++)
        {
            int dem=0;
            for (int j=1;j<=n;j++)
                if (a[i]==a[j])
                    dem=dem+1;
            if (dem>demmax)
            {
                demmax=dem;
                phantu=a[i];
            }
        }
        if (demmax==1)
            System.out.println("Khong co phan tu lap lai trong mang!");
        else
        {
            System.out.println("Phan tu xuat hien nhieu nhat la: "+phantu);
            System.out.println("So lan xuat hien la: "+demmax);
        }
    }
    public static void main(String[] args)
    {
        nhap();
        xuat();
        timkiemmax();
    }
}

