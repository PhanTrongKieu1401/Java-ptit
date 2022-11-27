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
public class J02012_SapXepChen {
    public static void in(int[] b,int soptb){
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        for(int i =0;i<n;i++)
            a[i]=sc.nextInt();
        b[0]=a[0];
        System.out.println("Buoc 0: "+a[0]);
        for(int i=1;i<n;i++){
            if(a[i]<b[i-1]){
                int j=i;
                while(j>=1&&b[j-1]>a[i]){
                    b[j]=b[j-1];
                    j--;
                }
                b[j]=a[i];
            }
            else b[i]=a[i];
            System.out.print("Buoc "+i+": ");
            for(int j=0;j<=i;j++)
                System.out.print(b[j]+" ");
            System.out.println();
        }
    }
}
