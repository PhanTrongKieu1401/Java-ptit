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
public class Solienke {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test-->0){
            String n=sc.next();
            int kt=1;
            for(int i=0;i<n.length()-1;i++){
                if(Math.abs((int)n.charAt(i)-(int)n.charAt(i+1))!=1){
                    kt=0;
                    break;
                }
            }
            if(kt==1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
