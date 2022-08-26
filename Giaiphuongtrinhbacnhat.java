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
import java.lang.String;
public class Giaiphuongtrinhbacnhat {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        if(a==0){
            if(b==0){
                System.out.println("VSN");
            }
            else{
                System.out.println("VN");
            }
        }
        else{
            float nghiem=(-b)/a;
            System.out.printf("%.2f",nghiem);
        }
    }
}
