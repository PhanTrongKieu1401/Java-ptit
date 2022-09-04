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
public class Demsolanxuathien {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        int demtest=1;
        while(test-->0){
            System.out.println("Test "+demtest+":");
            demtest++;
            
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++)
               a[i]=sc.nextInt();
            
            int[] check=new int[100000];
            for(int i=0;i<n-1;i++){
                if(check[a[i]]==0){
                    int dem=1;
                    check[a[i]]=1;
                    for(int j=i+1;j<n;j++){
                        if(a[j]==a[i])
                            dem++;
                    }
                    System.out.println(a[i]+" xuat hien "+dem+" lan");
                }
            }
            if(check[a[n-1]]==0)
                System.out.println(a[n-1]+" xuat hien 1 lan");
        }
    }
}
