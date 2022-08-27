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
public class Danhdauchucai {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        Set kq=new HashSet();
        for(int i=0;i<s.length();i++)
            kq.add(s.charAt(i));
        System.out.println(kq.size());
    }
}
