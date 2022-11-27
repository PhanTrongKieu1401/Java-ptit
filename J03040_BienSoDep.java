/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapjava;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class J03040_BienSoDep {
    private static boolean check(String s) {
        int[] a = new int[5];
        int id = 0;
        for(int i = 5; i < s.length(); i++){
            if(Character.isDigit(s.charAt(i)))
                a[id++] = s.charAt(i) - '0'; 
        }
        int inc = 0, allEquals = 0, locPhat = 0;
        for(int i = 0; i < 5; i++){
            if(i != 0){
                if(a[i] > a[i-1]) inc++;
                else if(a[i] == a[i-1]) allEquals++;
            }
            if(a[i] == 6 || a[i] == 8) locPhat++;
        }
        boolean tmp = false;
        if(a[0] == a[1] && a[1] == a[2] && a[3] == a[4])
            tmp = true;
        return (inc == 4 || allEquals == 4 || locPhat == 5 || tmp);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            if(check(s))
                System.out.println("YES");
            else 
                System.out.println("NO");
        }
    }
}
