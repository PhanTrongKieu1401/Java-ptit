/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapjava;

/**
 *
 * @author DELL
 */
import java.io.*;
public class J07005_SoKhacNhauTrongFile_2 {
    public static void main(String[] args) throws IOException {
        DataInputStream in=new DataInputStream(new FileInputStream("DATA.IN"));
        int a[]=new int[1000];
        for(int i=0;i<100000;i++)
            a[in.readInt()]++;
        for(int i=0;i<1000;i++)
            if(a[i]>0)
                System.out.println(i+" "+a[i]);
    }
}
