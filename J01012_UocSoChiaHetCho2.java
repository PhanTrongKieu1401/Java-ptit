/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapjava;

/**
 *
 * @author DELL
 */
import java.util.*;
public class J01012_UocSoChiaHetCho2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            long dem=0;
            for(int i=1;i*i<=n;i++){
                if(n%i==0){
                    if(i%2==0)
                        dem++;
                    if(n/i%2==0)
                        dem++;
                    if(i*i==n&&i%2==0)
                        dem--;
                }
            }
            System.out.println(dem);
        }
    }
}
