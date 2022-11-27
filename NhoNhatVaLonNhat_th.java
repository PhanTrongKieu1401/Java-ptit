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
public class Nhonhatvalonnhat_thuchanh {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n!=0){
            BigInteger solon=sc.nextBigInteger();
            BigInteger max=solon;
            BigInteger min=solon;
            for(int i=0;i<n-1;i++){
                solon=sc.nextBigInteger();
                max=max.max(solon);
                min=min.min(solon);
            }
            if(max.compareTo(min)==0)
                System.out.println("BANG NHAU");
            else
                System.out.println(min+" "+max);
            n=sc.nextInt();
        }
    }
}
