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
import java.math.BigInteger;
public class J03016_ChiaHetCho11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            BigInteger tg=new BigInteger("11");
            BigInteger n=sc.nextBigInteger();
            n=n.mod(tg);
            if(n.compareTo(BigInteger.ZERO)==0)
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}
