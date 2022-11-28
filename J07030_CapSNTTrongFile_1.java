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
public class J07030_CapSNTTrongFile_1 {
    private static int[] a = new int[1000001];
    public static void Sang(){
        Arrays.fill(a, 1);
        a[0] = a[1] = 0;
        for(int i = 2;i <= 1000;i++){
            if(a[i] == 1){
                for(int j = i*i;j <= 1000000;j += i)
                    a[j] = 0;
            }
        }
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream sc1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream sc2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        List<Integer> tmp1 = (ArrayList<Integer>) sc1.readObject();
        List<Integer> tmp2 = (ArrayList<Integer>) sc2.readObject();
        Sang();
        Set<Integer> trs1 = new TreeSet<>();
        for(Integer i:tmp1){
            if(a[i]==1)
                trs1.add(i);
        }           
        for(Integer i:trs1){           
            if(i >= 1000000 - i)
                break;
            else{
                if(tmp2.contains(1000000 - i) && a[1000000-i] == 1)                                       
                    System.out.println(i + " " + (1000000 - i));                                                                                     
            }
        }  
        sc1.close();
        sc2.close();       
    }
}
