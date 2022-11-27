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
public class J02005_GiaoCuaHaiDaySo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] kq=new int[1000];
        
        int tg;
        for(int i=0;i<n;i++){
            tg=sc.nextInt();
            if(kq[tg]==0)
                kq[tg]++;
        }
        for(int i=0;i<m;i++){
            tg=sc.nextInt();
            if(kq[tg]==1)
                kq[tg]++;
        }
        for(int i=0;i<1000;i++)
            if(kq[i]==2)
                System.out.print(i+" ");
    }
}
