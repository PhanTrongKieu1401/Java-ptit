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
public class J07040_LietKeTheoThuTuXuatHien {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream oi = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        List<String> alnp = (ArrayList<String>) oi.readObject();
        Set<String> snp = new TreeSet<>();
        for(String i:alnp){
            String[] tmp = i.trim().toLowerCase().split("\\s+");
            snp.addAll(Arrays.asList(tmp));
        }
        
        Scanner sc = new Scanner(new File("VANBAN.in"));
        while(sc.hasNext()){
            String s = sc.next().toLowerCase();
            if(snp.contains(s)){
                System.out.println(s);
                snp.remove(s);
            }
        }
        
    }
}
