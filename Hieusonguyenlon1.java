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
public class Hieusonguyenlon1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test-->0){
            BigInteger x=sc.nextBigInteger();
            BigInteger y=sc.nextBigInteger();
            BigInteger z=(x.subtract(y)).abs();
            System.out.println(x.bitLength());
            System.out.println(y.bitLength());
            System.out.println(z.bitLength());
            System.out.println(z);
        }
    }
}
