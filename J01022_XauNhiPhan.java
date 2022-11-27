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
public class J01022_XauNhiPhan {
    static long[] arr=new long[93];
    public static int kt(int n,long k){
        if(n==1)
            return 0;
        if(n==2)
            return 1;
        if(k>arr[n-2])
            return kt(n-1,k-arr[n-2]);
        else
            return kt(n-2,k);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        arr[0]=0;
        arr[1]=1;
        for(int i=2;i<93;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        int test=sc.nextInt();
        while(test-->0){
            int n;
            long k;
            n=sc.nextInt();
            k=sc.nextLong();
            System.out.println(kt(n, k));
        }
    }
}
