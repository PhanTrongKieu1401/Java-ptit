/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VaoRaFile;

import java.io.*;
import java.util.*;

/**
 *
 * @author DELL
 */
public class J07029_SNTLonNhatTrongFile {
    private static int[] a = new int[1000001];
    public static void Sang(){
        Arrays.fill(a, 1);
        a[0]=a[1]=0;
        for(int i=2;i<=1000;i++){
            if(a[i]==1){
                for(int j=i*i;j<=1000000;j+=i)
                    a[j]=0;
            }
        }
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DATA.in"));
        List<Integer> tmp = (List<Integer>) sc.readObject();
        int[] ans = new int[1000001];
        Sang();
        for(Integer i:tmp){
                ans[i] += a[i];
        }
        int dem=0;
        for(int i=999997;i>=2;i--){
            if(dem==10)
                break;
            else{
                if(ans[i]>0){
                    System.out.println(i+" "+ans[i]);
                    dem++;
                }
            }
        }
        sc.close();
    }
}
