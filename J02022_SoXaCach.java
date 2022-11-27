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


public class J02022_SoXaCach {
    static int n;
    static int a[] = new int [10];
    static boolean check[] = new boolean [10];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while(T-- > 0){
            n = in.nextInt();
            Try(0);
        }
    }
    public static boolean check(){
        for (int i = 1; i < n; i++){
            if (Math.abs(a[i] - a[i - 1]) == 1) return false;
        }
        return true;
    }
    public static void Try(int j){
        for (int i = 1; i <= n; i++){
            if (!check[i]){
                check[i] = true;
                a[j] = i;
                if (j == n - 1){
                    if (check()){
                        for (int t = 0; t < n; t++){
                            System.out.print(a[t]);
                        }
                        System.out.println();
                    }
                }
                else Try(j + 1);
                check[i] = false;
            }
        }
    }
}
