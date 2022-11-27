/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapjava;

import java.util.*;
import java.io.*;

/**
 *
 * @author DELL
 */
public class TinhTongFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("DATA.in"));
        long kq=0;
        while(sc.hasNext()){
            String s=sc.next();
            try {
                kq=kq+Integer.parseInt(s);
            } catch (NumberFormatException e) {
                continue;
            }
        }
        System.out.println(kq);
    }
}
