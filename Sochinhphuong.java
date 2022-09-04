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
public class Sochinhphuong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test-->0){
            long n=sc.nextLong();
            if(Math.sqrt(n)==Math.ceil(Math.sqrt(n)))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
