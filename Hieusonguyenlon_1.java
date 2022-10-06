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
import java.math.*;
import java.lang.*;
public class Hieusonguyenlon_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test-->0){
            BigInteger x=sc.nextBigInteger();
            BigInteger y=sc.nextBigInteger();
            
            if(x.compareTo(y)<0){
                BigInteger tmp= x;
                x=y;y=tmp;               
            }
            BigInteger z=x.subtract(y);
           if(x.toString().length()>z.toString().length())
                System.out.print("0");
            System.out.println(z);
        }
    }
}
