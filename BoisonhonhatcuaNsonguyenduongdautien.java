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
public class BoisonhonhatcuaNsonguyenduongdautien {
    public static long ucln(long a,long b){
        if(b==0)
            return a;
        return ucln(b,a%b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);              
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long kq=1;
            for(int i=1;i<n+1;i++)
                kq=i*kq/ucln(i,kq);
            System.out.println(kq);
        }
    }
}
