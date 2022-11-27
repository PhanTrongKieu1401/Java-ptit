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
public class J03027_RutGonXauKyTu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String kq="";
        Stack<Character> t=new Stack<Character>();
        t.push(s.charAt(0));
        for(int i=1;i<s.length();i++)
            if(!t.empty()&&s.charAt(i) ==t.peek()){
                t.pop();
            }
            else
                t.push(s.charAt(i));
        if(t.empty())
            System.out.println("Empty String");
        else{
            while(!t.empty()){
                kq=t.pop()+kq;
            }
        }
        System.out.println(kq);
    }
}
