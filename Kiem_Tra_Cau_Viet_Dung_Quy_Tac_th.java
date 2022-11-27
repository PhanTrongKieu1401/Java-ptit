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
public class Kiem_Tra_Cau_Viet_Dung_Quy_Tac_th {
    public static boolean check(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='[' || s.charAt(i)==']' || s.charAt(i)=='(' ||s.charAt(i)==')'){
                if (s.charAt(i) == '[' || s.charAt(i) == '(') {
                    stack.add(s.charAt(i));
                } else {
                    if (!stack.isEmpty()) {
                        if (s.charAt(i) == ']' && stack.peek() == '[') stack.pop();
                        else if (s.charAt(i) == ')' && stack.peek() == '(') stack.pop();
                        else return false;
                    } else
                        return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s=sc.nextLine();
            if(check(s))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
