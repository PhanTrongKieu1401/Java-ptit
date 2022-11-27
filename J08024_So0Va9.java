/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaCollections;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author DELL
 */
public class J08024_So0Va9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            Queue<Integer> q=new ArrayDeque<>();
            q.add(9);
            while(q.peek()%n!=0){
                int val=q.remove();
                q.add(val*10);
                q.add(val*10+9);
            }
            System.out.println(q.peek());
        }
    }
}
