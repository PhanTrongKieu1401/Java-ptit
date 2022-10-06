/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapjava;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class BoSungDaySo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[201];
        int max=0,t=n;
        boolean kt=true;
        for(int i=0;i<n;i++){
            int val=sc.nextInt();
            a[val]++;
            if(val>max)
                max=val;
        }
        if(max==n)
            System.out.println("Excellent!");
        else{
            for(int i=1;i<=max;i++)
                if(a[i]==0)
                    System.out.println(i);
        }
    }
}
