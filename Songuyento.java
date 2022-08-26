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
public class Songuyento {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test-->0){
            long so=sc.nextLong();
            boolean kt=true;
            for(long i=2;i<=so/2;i++){
                if(so%i==0){
                    kt=false;
                    break;
                }
            }
            if(kt==true){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
