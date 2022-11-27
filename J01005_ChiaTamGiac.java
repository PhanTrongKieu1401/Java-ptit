/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapjava;

/**
 *
 * @author DELL
 */
import java.util.Scanner;
import java.lang.Math;
public class J01005_ChiaTamGiac {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test-->0){
            long phan=sc.nextLong();
            long cc=sc.nextLong();                
            long n=1;
            while(n<phan){              
                System.out.printf("%6f ",cc*Math.sqrt((double)n/phan));
                n++;
            }
            System.out.printf("%n");
        }
    }
}
