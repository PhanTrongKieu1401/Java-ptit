/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapjava;

/**
 *
 * @author DELL
 */
import java.util.Scanner;
public class Tonguocso1 {
    static int a[] = new int [2000001];
    public static void Solve(){
        for (int i = 2; i*i <= 2000000; i++){
            if (a[i] == 0){
                for (int j = i * i; j <= 2000000; j += i){
                    a[j] = i;
                }
            }
        }
        for (int i = 2; i <= 2000000; i++){
            if (a[i] == 0) a[i] = i;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solve();
        int n = sc.nextInt();
        long sum = 0;
        while (n-- > 0){
            int t = sc.nextInt();
            while (t != 1){
                sum += a[t];
                t /= a[t];
            }
        }
        System.out.println(sum);
    }
}
