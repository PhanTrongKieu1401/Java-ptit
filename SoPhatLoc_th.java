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
public class Sophatloc_thuchanh {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=Integer.parseInt(sc.nextLine());
        while(test-->0){
            String s=sc.nextLine();
            if(s.endsWith("86"))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
