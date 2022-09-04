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
public class Taphopsonguyen_thuchanh {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[m];
        int[] c=new int[1000];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(c[a[i]]==0)
                c[a[i]]=1;
        }
        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
            if(c[b[i]]==1)
                c[b[i]]=2;
            else
                if(c[b[i]]==0)
                    c[b[i]]=3;
        }
        for(int i=0;i<1000;i++)
            if(c[i]==2){
                System.out.print(i+" ");
            }
        System.out.println();
        for(int i=0;i<1000;i++)
            if(c[i]==1){
                System.out.print(i+" ");
            }
        System.out.println();
        for(int i=0;i<1000;i++)
            if(c[i]==3){
                System.out.print(i+" ");
            }
        System.out.println();
    }
}
