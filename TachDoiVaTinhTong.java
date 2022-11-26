/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapjava;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

/**
 *
 * @author DELL
 */
public class TachDoiVaTinhTong {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        BigInteger a = sc.nextBigInteger();
        while(a.compareTo(BigInteger.TEN) >= 0){
            String tmp = a.toString();
            int len = tmp.length();
            BigInteger n1 = new BigInteger(tmp.substring(0, len/2));
            BigInteger n2 = new BigInteger(tmp.substring(len/2));
            a = n1.add(n2);
            System.out.println(n1.add(n2));
        }
    }
}
