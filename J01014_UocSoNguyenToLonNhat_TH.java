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
import java.lang.*;
public class J01014_UocSoNguyenToLonNhat_TH {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test-->0){
            long n=sc.nextLong();
            long max=0;
            for(int i=2;i<Math.sqrt(n);i++){
                if(n%i==0){
                    max=i;
                    while(n%i==0)
                        n=n/i;
                }
            }
            if(n!=0)
                System.out.println(n);
            else
                System.out.println(max);
        }
    }
}
