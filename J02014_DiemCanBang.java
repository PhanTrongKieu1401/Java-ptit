/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapjava;

/**
 *
 * @author DELL
 */
import java.util.Scanner;
public class J02014_DiemCanBang {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[100001];
            int tong=0;
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                tong+=a[i];
            }
            int s=0,k=0;
            for(int i=0;i<=n-1;i++){
                tong-=a[i];
                if(tong==s) {
                    k=i+1;
                    break;
                }
                s+=a[i];
            }
            if(k==0)
                System.out.println("-1");
            else
                System.out.println(k);
        }
    }
}

