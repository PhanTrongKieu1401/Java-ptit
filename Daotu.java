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
public class Daotu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        sc.nextLine();
        while(test-->0){
            String s=sc.nextLine();
            System.out.println(Daotu(s));
        }
    }
    public static String Daotu(String s){
        StringTokenizer sd=new StringTokenizer(s);
        StringBuilder kq=new StringBuilder();
        while(sd.hasMoreTokens()){
            String t=sd.nextToken();
            for(int i=t.length()-1;i>=0;i--){
                kq.append(t.charAt(i));
            }
            kq.append(" ");
        }
        return kq.toString();
    }
}
