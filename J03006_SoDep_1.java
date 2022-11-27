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
public class J03006_SoDep_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test-->0){
            String s=sc.next();
            int kt=1;
            for(int i=0;i<s.length()/2;i++){
                if(s.charAt(i)==s.charAt(s.length()-i-1)){
                    if((int)s.charAt(i)%2!=0 || (int)s.charAt(s.length()-i-1)%2!=0){
                        kt=0;
                        break;
                    }
                }
                else{
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
