/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaCollections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class SoNguyenThuy_th {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            Queue<String> q=new LinkedList<>();
            q.add("4");
            q.add("5");
            int dem=0;
            while(!q.isEmpty()){
                String s=q.poll();
                dem++;
                String tmp=s;
                for(int i=s.length()-1;i>=0;i--){
                    tmp+=s.charAt(i);
                }
                System.out.print(tmp+" ");
                if(dem==n)
                    break;
                q.add(s+"4");
                q.add(s+"5");
            }
            System.out.println();
        }
    }
}
