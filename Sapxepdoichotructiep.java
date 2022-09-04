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
public class Sapxepdoichotructiep {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        
        int demtest=1;
        for(int i=0;i<n-1;i++){
            int kt=1;           
            for(int j=i+1;j<n;j++){
                if(a[j]<a[i]){
                    int tg=a[j];
                    a[j]=a[i];
                    a[i]=tg;
                    kt=0;
                }
            }
            if(kt==1)
                break;
            else{
                System.out.print("Buoc "+demtest+": ");
                demtest++;
                for(int z=0;z<n;z++)
                    System.out.print(a[z]+" ");
            }
            System.out.println();
        }
    }
}
