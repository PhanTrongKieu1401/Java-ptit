/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapjava;

/**
 *
 * @author DELL
 */
import java.util.*;
public class LietKeToHop_2 {
    static boolean kt=false;
    public static void in(int[] a,int n){
        for(int i=0;i<n;i++)
            System.out.print(a[i]);
        System.out.print(" ");
    }
    public static void sinh(int[] a,int n,int k){
        int i=k-1;
        while(i>=0){
            if(a[i]<n-k+i+1)
                break;
            else
                i--;
        }
        if(i==-1)
            kt=true;
        else{
            a[i]++;
            for(int j=i+1;j<k;j++)
                a[j]=a[j-1]+1;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int dem=0;
        int[] a=new int[k];
        for(int i=0;i<k;i++)
            a[i]=i+1;
        while(!kt){
            dem++;
            in(a,k);
            sinh(a,n,k);
        }
        System.out.println();
        System.out.println("Tong cong co "+dem+" to hop");
    }
}
