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
public class J01001_HinhChuNhat {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a=sc.nextLong();
        long b=sc.nextLong();
        long chuvi;
        long dientich;
        if (a<=0 || b<=0){
            System.out.println("0");
        }
        else{
            chuvi=(a+b)*2;
            dientich=a*b;
            System.out.println(chuvi+" "+dientich);
        }
    }
}
