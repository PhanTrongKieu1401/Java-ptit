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
public class J02004_MangDoiXung {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test-->0){
            int n=sc.nextInt();
            long[] a=new long[n];
            for(int i=0;i<n;i++)
                a[i]=sc.nextLong();
            boolean kt=true;
            for(int i=0;i<n/2;i++)
                if(a[i]!=a[n-i-1]){
                    kt=false;
                    break;
                }
            if(kt==true)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
