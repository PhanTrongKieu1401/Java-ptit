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
public class J01011_BoiSoChungUocSoChung {
    public static long usc(long a,long b){
        long m;
        while(b!=0){
            m=a%b;
            a=b;
            b=m;
        }
        return a;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test-->0){
            long a=sc.nextLong();
            long b=sc.nextLong();
            long ucnn=usc(a,b);
            System.out.println(a/ucnn*b+" "+ucnn);
        }
    }
}
