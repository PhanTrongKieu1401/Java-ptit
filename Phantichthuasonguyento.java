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
public class Phantichthuasonguyento {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);    
        int test=sc.nextInt();
        int j=1;
        while(test-->0){
            long n=sc.nextLong();
            System.out.print("Test "+j+": ");
            j++;
            long m=n/2;
            for(int i=2;i<m;i++){
                if(n%i==0){
                    int dem=0;
                    while(n%i==0){
                        n=n/i;                      
                        dem++;
                    }
                    System.out.print(i+"("+dem+") ");
                }               
            }
            System.out.println();
        }
    }
}
