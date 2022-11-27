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
public class JKT013_SoLocPhat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String end="";
            for(int i = 0; i < n; i++){
                end += "8";
            }
            Stack<String> st=new Stack<>();
            Queue<String> q=new ArrayDeque<>();
            q.add("6");q.add("8");
            while(!q.isEmpty()){
                String val=q.remove();
                st.push(val);
                if(end.equals(val)){
                    break;
                }
                q.add(val+'6');q.add(val+'8');
            }
            System.out.println(st.size());
            while(!st.empty()){
                System.out.print(st.pop()+" ");
            }
            System.out.println();
        }
    }
}
