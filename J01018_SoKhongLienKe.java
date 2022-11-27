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
public class J01018_SoKhongLienKe {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test-->0){
            String s=sc.next();
            boolean kt=true;
            int tong=(int)(s.charAt(0)-'0');
            for(int i=1;i<s.length();i++){
                if(2==Math.abs((int)(s.charAt(i-1)-s.charAt(i))))
                    tong=tong+(int)(s.charAt(i)-'0');
                else {
                    kt=false;
                    break;
                }
            }       
            if(tong%10!=0)
                kt=false;
            if(kt==true)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
