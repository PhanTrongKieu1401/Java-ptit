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
public class J08021_DayNgoacDungDaiNhat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String xau=sc.next();
            Stack<Integer> st=new Stack<>();
            st.push(-1);
            int length=0;
            for(int i=0;i<xau.length();i++){
                if(xau.charAt(i)=='('){ st.push(i); }
                else{
                    st.pop();
                    if(st.size()>0){
                        length=Math.max(length, i-st.peek());
                    }
                    else   st.push(i);
                }
            }
            System.out.println(length);
        }
    }
}
