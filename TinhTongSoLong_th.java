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
public class TinhTongSoLong_th {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("DATA.in"));
        long kq=0;
        long val;
        while(sc.hasNext()){
            String s=sc.next();
            try {
                if(Long.parseLong(s)>Math.pow(2, 31)-1)
                    kq+=Long.parseLong(s);
            } catch (Exception e) {
                continue;
            }           
        }
        System.out.println(kq);
    }
}
