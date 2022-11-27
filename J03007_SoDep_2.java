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
public class J03007_SoDep_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test-->0){
            String s=sc.next();
            int kt=1;
            int tong=0;
            if(s.charAt(0)!='8' || s.charAt(s.length()-1)!='8'){
                kt=0;
            }
            else
                tong=16;
            for(int i=1;i<s.length()/2;i++){
                if(s.charAt(i)==s.charAt(s.length()-i-1)){
                    tong=tong+(int)(s.charAt(i)-'0')+(int)(s.charAt(s.length()-i-1)-'0');
                }
                else
                    kt=0;
            }
            if(tong%10!=0)
                kt=0;
            if(kt==1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
