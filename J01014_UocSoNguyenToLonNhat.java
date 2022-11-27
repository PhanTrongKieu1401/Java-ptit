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

public class J01014_UocSoNguyenToLonNhat {
    private static long max(long n) {
        long ans = 2;
        while(n % 2 == 0){
            n >>= 1;
        }
        for(int i = 3; i <= Math.sqrt(n); i+=2){
            while(n % i == 0){
                n /= i;
                ans = i;
            }
        }
        if(n > 2) ans = n;
        return ans;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            System.out.println(max(n));
        }
    }
}
