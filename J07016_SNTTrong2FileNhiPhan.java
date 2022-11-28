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
public class J07016_SNTTrong2FileNhiPhan {
    static int[] arrNT = new int[10000]; 
    public static void sang(){
        Arrays.fill(arrNT,1);
        arrNT[0]=arrNT[1]=0;
        for(int i = 2; i <= 100; i++){
            if(arrNT[i] == 1){
                for(int j = i*i; j < 10000; j += i)
                    arrNT[j]=0;
            }
        }
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream sc1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream sc2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        List<Integer> arrF1 = (List<Integer>) sc1.readObject();
        List<Integer> arrF2 = (List<Integer>) sc2.readObject();
        sang();
        int[][] ans = new int[10000][2];
        for(Integer i:arrF1){
            ans[i][0] += arrNT[i];
        }
        for(Integer i:arrF2){
            ans[i][1] +=arrNT[i];
        }
        for(int i=0; i <10000; i++){
            if(ans[i][0] > 0 && ans[i][1] > 0){
                System.out.println(i + " " + ans[i][0] + " " + ans[i][1]);
            }
        }
    }
}
