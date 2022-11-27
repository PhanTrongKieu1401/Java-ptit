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
public class J02013_SapXepNoiBot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];       
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int j=1;j<=n;j++){
            boolean kt=true;
            for(int i=0;i<n-1;i++){
                if(a[i]>a[i+1]){
                    swap(a,i,i+1);
                    kt=false;
                }
            }
            if(!kt){
                System.out.print("Buoc "+j+": ");
                for(int i=0;i<n;i++){
                    System.out.print(a[i]+" ");
                }
                System.out.println();
            }
            else break;
        }
    }

    private static void swap(int[] a,int i, int j) {
        int tg=a[i];
        a[i]=a[j];a[j]=tg;
    }
}
