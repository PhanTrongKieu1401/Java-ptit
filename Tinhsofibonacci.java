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
public class Tinhsofibonacci {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long[] arr;
        arr=new long[92];
        arr[0]=1;arr[1]=1;
        for(int i=2;i<92;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        int test=sc.nextInt();
        while(test-->0){
            int n=sc.nextInt();
            System.out.println(arr[n-1]);
        }
    }
}
