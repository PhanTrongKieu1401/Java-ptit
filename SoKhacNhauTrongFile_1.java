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
import java.io.*;
public class SoKhacNhauTrongFile_1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("DATA.in"));
        int[] arr=new int[100000];
        while(sc.hasNextInt()){
            int val=sc.nextInt();
            arr[val]++;
        }
        for(int i=0;i<1000;i++)
            if(arr[i]>0)
                System.out.println(i+" "+arr[i]);
    }
}
