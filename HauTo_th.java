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
public class HauTo_th {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            int n=Integer.parseInt(sc.nextLine());
            ArrayList<String> arr=new ArrayList<>();
            while(n-->0){
                arr.add(sc.next());
            }
            sc.nextLine();
            System.out.println(tinhtoan(arr));
        }
    }
    public static Long tinhtoan(ArrayList<String> arr){
            Stack<Long> st=new Stack<>();
            for(int i=0;i<arr.size();i++){
                if(arr.get(i).equals("+")||arr.get(i).equals("-")||arr.get(i).equals("*")||arr.get(i).equals("/")||arr.get(i).equals("^")||arr.get(i).equals("%")){
                    Long val1=st.pop();
                    Long val2=st.pop();
                    Long tmp = null;
                    switch (arr.get(i)) {
                        case "+": tmp=val1+val2; break;
                        case "-": tmp=val2-val1; break;
                        case "*": tmp=val1*val2; break;
                        case "/": tmp=val2/val1; break;
                        case "^": 
                            tmp=val2;
                            for(int j=1;j<=val1;j++)
                                tmp*=val2;
                            break;
                        case "%": tmp=val2%val1; break;
                    }
                    st.push(tmp);
                }
                else
                    st.push(Long.parseLong(arr.get(i)));
            }
            return st.peek();
    }
}
