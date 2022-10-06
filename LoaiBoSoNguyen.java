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
public class LoaiBoSoNguyen {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc=new Scanner(new File("input.txt"));
        ArrayList<String> arr=new ArrayList<>();
        int kq=0;
        while(sc.hasNext()){
            String tmp=sc.next();
            try{
                kq=Integer.parseInt(tmp);
            }
            catch(NumberFormatException s){
                arr.add(tmp);
                continue;
            }
        }
        Collections.sort(arr);
        for (String i : arr)
            System.out.printf("%s ",i);
        System.out.println();
    }
}
