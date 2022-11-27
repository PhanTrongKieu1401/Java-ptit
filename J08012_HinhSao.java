/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaCollections;

/**
 *
 * @author DELL
 */
import java.util.*;
public class J08012_HinhSao {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n+5];
        for(int i=1;i<n;i++){
            int dau=sc.nextInt();
            int cuoi=sc.nextInt();
            a[dau]++;a[cuoi]++;
        }
        int dem=0;
        for(int i=1;i<=n;i++){
            if(a[i]==1)
                dem++;
        }
        if(dem==n-1)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
