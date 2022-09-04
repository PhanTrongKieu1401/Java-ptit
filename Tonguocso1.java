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
public class Tonguocso1 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long tong=0;
        while(n-->0){
            long ts=sc.nextLong();
            for(int i=2;i<=ts;i++){
                if(ts%i==0){
                    while(ts%i==0){
                        ts=ts/i;
                        tong=tong+i;
                    }
                }
            }
        }
        System.out.println(tong);
    }
}
