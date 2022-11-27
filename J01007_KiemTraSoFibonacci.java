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
public class J01007_KiemTraSoFibonacci {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        long[] arr;
        arr=new long[92];
        arr[0]=0;arr[1]=1;
        for(int i=2;i<92;i++)
            arr[i]=arr[i-1]+arr[i-2];       
        while(test-->0){
            long n=sc.nextLong();
            boolean kt=false;
            for(int i=0;i<92;i++){
                if(arr[i]==n){
                    kt=true;
                    break;
                }
            }
            if(kt==true)
                System.out.println("YES");           
            else
                System.out.println("NO");
        }
    }
}
