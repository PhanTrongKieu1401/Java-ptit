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
public class GhepMa_th {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream sc1=new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<String> ds1=(ArrayList<String>) sc1.readObject();
        ObjectInputStream sc2=new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> ds2=(ArrayList<Integer>) sc2.readObject();
        TreeSet<String> s=new TreeSet<>();
        for(String i:ds1)
            for(Integer j:ds2){
                s.add(i+Integer.toString(j));
            }
        for(String i:s)
            System.out.println(i);
        sc1.close();
        sc2.close();
    }
}
