/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapjava;

import java.io.*;
import java.util.*;

/**
 *
 * @author DELL
 */
public class J07015_SoNTTrongFileNhiPhan {
    static int[] a=new int[10000];
    public static void loc(){
        Arrays.fill(a, 1);
        a[0]=a[1]=0;
        for(int i=2;i<=100;i++){
            if(a[i]==1){
                for(int j=i*i;j<10000;j+=i)
                    a[j]=0;
            }
        }
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        loc();
        ObjectInputStream sc=new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        List<Integer> b=(List<Integer>) sc.readObject();
        int[] kq=new int[10000];
        for(Integer i:b){
            kq[i]+=a[i];
        }
        for(int i=2;i<10000;i++){
            if(kq[i]>0){
                System.out.println(i+" "+kq[i]);
            }
        }
        sc.close();
    } 
}
