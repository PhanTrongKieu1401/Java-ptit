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
public class Xaudoixung {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test-->0){
            String s=sc.next();
            int dem=0;
            for(int i=0;i<s.length()/2;i++)
                if(s.charAt(i)!=s.charAt(s.length()-i-1))
                    dem++;
            if((dem==0 && s.length()%2==1)||dem==1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
