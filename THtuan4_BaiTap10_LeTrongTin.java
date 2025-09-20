/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author LeTrongTIn
 */
import java.util.Scanner;
public class THtuan4_BaiTap10_LeTrongTin 
{
    static Scanner sc = new Scanner(System.in);
    static int A[] = new int[100], n, i;
    static void Nhap()
    {
        System.out.print("Nhap so phan tu cua mang: ");
        n = sc.nextInt();
        for (i=1;i<=n;i++)
        {
            System.out.print("A["+i+"]= ");
            A[i] = sc.nextInt();
        }
        
    }
    static void Xuat()
    {
        for (i=1;i<=n;i++)
            System.out.print(A[i]+" ");
        System.out.println();
    }
    static void them()
    {        
        int x, vtri;
        System.out.print("Nhap vi tri chi dinh: ");
        vtri = sc.nextInt();

        System.out.print("Nhap gia tri can them: ");
        x = sc.nextInt();
        n++;
        for (i=n;i>=vtri+1;i--)
            A[i]=A[i-1];
        A[vtri]=x;
    }
    static void xoa()
    {
        int vtri;
        System.out.print("Nhap vi tri chi dinh: ");
        vtri = sc.nextInt();
        for (i=vtri;i<=n;i++)
            A[i]=A[i+1];
        n--;
    }
    static void Menu()
    {
        int opt;
        System.out.println("1.Them 1 phan tu tai vi tri chi dinh.");
        System.out.println("2.Xoa 1 phan tu tai vi tri chi dinh.");
        opt = sc.nextInt();
        switch(opt)
        {   
            default: System.out.println("Lua chon khong hop le."); break;
            case 1: them(); break;
            case 2: xoa(); break;
            
        }
    }
    public static void main(String args[]) 
    {
        Nhap();
        Xuat();
        Menu();
        Xuat();
    }
}
