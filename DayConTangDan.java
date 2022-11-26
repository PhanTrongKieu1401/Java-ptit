/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapjava;

import java.io.*;
import java.util.*;

/**
 *
 * @author DELL
 */
public class DayConTangDan {
    private static int n;
    private static int[] a = new int[21], b = new int[21];
    private static TreeSet<String> set = new TreeSet<>();
    private static void update() {
        int curr = 0, cnt = 0;
        for(int i = 1; i <= n; i++){
            if(b[i] == 1){
                cnt += 1;
                if(a[i] < curr)
                    return;
                curr = a[i];
            }
        }
        if(cnt <= 1) return;
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= n; i++){
            if(b[i] == 1){
                sb.append(String.valueOf(a[i]));
                sb.append(" ");
            }
        }
        set.add(sb.toString());
    }
    
    private static void Try(int i) {
        for(int j = 0; j < 2; j++){
            b[i] = j;
            if(i == n){
                update();
            }
            else
                Try(i + 1);
        }
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DAYSO.in"));
        n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            a[i] = sc.nextInt();
        }
        Try(1);
        for(String x : set){
            System.out.println(x);
        }
    }
}
