/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaCollections;

import java.util.*;

/**
 *
 * @author DELL
 */
public class JKT015_GoBanPhim {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String xau=sc.next();
        Stack<Character> st1=new Stack<>();
        Stack<Character> st2=new Stack<>();
        for(int i=0;i<xau.length();i++){
            if(xau.charAt(i)=='<'){
                if(!st1.isEmpty())
                    st2.push(st1.pop());
            }
            else{
                if(xau.charAt(i)=='>'){
                    if(!st2.isEmpty())
                        st1.push(st2.pop());
                }
                else{
                    if(xau.charAt(i)=='-'){
                        if(!st1.isEmpty())
                            st1.pop();
                    }
                    else
                        st1.push(xau.charAt(i));
                }
            }
        }
        while(!st2.isEmpty())
            st1.push(st2.pop());
        for(int i=0;i<st1.size();i++){
            System.out.print(st1.get(i));
        }
        System.out.println();
        
    }
}
