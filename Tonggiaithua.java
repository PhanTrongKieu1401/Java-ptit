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
public class Tonggiaithua {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long tong=0;
        long a=1;
        for(int i=1;i<n+1;i++){
            a=a*i;
            tong=tong+a;         
        }
        System.out.println(tong);
    }
}
