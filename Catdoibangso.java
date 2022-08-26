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
public class Catdoibangso {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        //sc.next();
        while(test-->0){
            String s=sc.next();
            long tong=0;
            long m;
            boolean kt=true;
            for(int i=0;i<s.length();i++)
                if(s.charAt(i)=='1')
                    tong=tong*10+1;                   
                else
                    if(s.charAt(i)=='0' || s.charAt(i)=='8' || s.charAt(i)=='9')
                        tong=tong*10;                                          
                    else{
                        kt=false;
                        break;
                    }
            if(kt==true && tong!=0)
                System.out.println(tong);
            else
                System.out.println("INVALID");
        }
    }
}

