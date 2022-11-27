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
public class J08022_PhanTuBenPhaiDauTienLonHon {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            int[] ans=new int[n];
            Stack<Integer> st=new Stack<>();
            for(int i=0;i<n;i++)
                a[i]=sc.nextInt();
            for(int i=n-1;i>=0;i--){
                while(!st.empty() && a[i]>=st.peek())
                    st.pop();
                if(st.empty()) ans[i]=-1;
                else  ans[i]=st.peek();
                st.push(a[i]);
            }
            for(int i=0;i<n;i++)
                System.out.print(ans[i]+" ");
            System.out.println();
        }
    }
}
