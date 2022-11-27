/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaCollections;

/**
 *
 * @author DELL
 */
import java.util.*;
public class J08020_KiemTraDayNgoacDung {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String xau=sc.next();
            Stack<Character> st=new Stack(); 
            for(int i=0;i<xau.length();i++){
                if(xau.charAt(i)=='(' || xau.charAt(i)=='[' || xau.charAt(i)=='{' ){
                    st.push(xau.charAt(i));
                }
                else{
                    if(!st.empty()&&xau.charAt(i)==')'&&st.peek()=='(')		
                        st.pop();
                    else{
			if(!st.empty()&&xau.charAt(i)==']'&&st.peek()=='[')		
                            st.pop();
			else{
                            if(!st.empty()&&xau.charAt(i)==')'&&st.peek()=='(')
                                st.pop();
			}
                    }
                }
            }
            if(st.empty())
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
