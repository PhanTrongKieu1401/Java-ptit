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
public class Sotamphan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test-->0){
            String s=sc.next();
            boolean kt=true;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)!='0'&&s.charAt(i)!='1'&&s.charAt(i)!='2'){
                    kt=false;
                    break;
                }
            }
            if(kt==true)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
