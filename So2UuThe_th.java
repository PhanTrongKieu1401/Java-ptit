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
public class So2UuThe_th {
    private int[] b={0,1,2};
    public static boolean check(String n){
        int dem=0;
        for(int i=0;i<n.length();i++){
            if(n.charAt(i)=='2'){
                dem++;
            }
        }
        if(dem>n.length()/2)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            Queue<String> q=new LinkedList<>();
            q.add("1");
            q.add("2");
            int ok=0;
            while(!q.isEmpty()){
                if(ok==n) break;
                String tmp=q.poll();
                if(check(tmp)){
                    ok++;
                    System.out.print(tmp+" ");
                }
                q.add(tmp+"0");
                q.add(tmp+"1");
                q.add(tmp+"2");
               
            }
            System.out.println();
        }
    }
}
