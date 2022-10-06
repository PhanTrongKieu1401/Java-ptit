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
import java.io.*;
import java.math.*;
public class KiemTraChiaHet_th {
    static BigInteger d1=new BigInteger("7");
    static BigInteger d2=new BigInteger("13");
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("SONGUYEN.IN"));
        int t=sc.nextInt();
        while(t-->0){
            BigInteger a=sc.nextBigInteger();
            BigInteger tmp1=a.divide(d1);
            BigInteger tmp2=a.divide(d2);
            if(a.compareTo(tmp1.multiply(d1))==0 && a.compareTo(tmp2.multiply(d2))==0)
                System.out.println("Both");
            else
                if(a.compareTo(tmp1.multiply(d1))==0)
                    System.out.println("Div 7");
                else
                    if(a.compareTo(tmp2.multiply(d2))==0)
                        System.out.println("Div 13");
                    else
                        System.out.println("None");
        }
    }
}
