/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapjava;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author DELL
 */
public class Thiet_Lap_Dia_Chi_Email_th {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("DANHSACH.in"));
        LinkedHashSet<String> set=new LinkedHashSet<>();
        while(sc.hasNext()){
            String str=sc.nextLine();
            str=str.trim().toLowerCase();
            str=str.replaceAll("\\s+"," ");
            String[] tmp=str.split(" ");
            String st="";
            for(int i=0;i<tmp.length;i++){
                st+=String.valueOf(tmp[i].charAt(0)).toUpperCase()+tmp[i].substring(1);
                if(i<tmp.length-1){
                    st+=" ";
                }
            }
            set.add(str);
        }
        Set<String> set1=new HashSet<>();
        for(int i=0;i<set.toArray().length;i++){
            String index=set.toArray()[i].toString();
            String[] s= index.toLowerCase().trim().split("[^a-zA-Z]+");
            String ans=s[s.length-1];
            for(int j=0;j<s.length-1;j++){
                ans+=s[j].charAt(0);
            }
            int num=2;
            String tmp=ans;
            while(set1.contains(tmp)){
                tmp=ans+String.valueOf(num);
                num++;
            }
            ans=tmp;
            if(!set1.contains(ans)){
                set1.add(ans);
            }
            System.out.println(ans+"@ptit.edu.vn");
        }
    }
}
