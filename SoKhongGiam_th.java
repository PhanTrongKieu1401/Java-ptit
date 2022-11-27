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
public class SoKhongGiam_th {
    static int[] a=new int[100000];
    static int[] b=new int[100000];
    
    public static int phantich(int i){
        if(i<10)
            return 0;
        int tmp=i%10;
        i=i/10;
        while(i>0){
            if(i%10>tmp) return 0;
            tmp=i%10;
            i=i/10;
        }
        return 1;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream sc=new ObjectInputStream(new FileInputStream("DATA1.in"));
        List<Integer> val1=(List<Integer>) sc.readObject();
        for(int i: val1){
            if(phantich(i)==1){
                a[i]++;
            }
        }
        sc=new ObjectInputStream(new FileInputStream("DATA2.in"));
        List<Integer> val2=(List<Integer>) sc.readObject();
        for(int i: val2){
            if(phantich(i)==1){
                b[i]++;
            }
        }
        for(int i=11;i<10000;i++){
            if(a[i]>0||b[i]>0)
                System.out.println(i+" "+a[i]+" "+b[i]);
        }
    }
}
