/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapjava;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class ChuanHoaXauHoTenTrongFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while(true){
            String s = sc.nextLine();
            if(s.equals("END"))
                break;
            s = s.trim();
            String[] arr = s.split("\\s+");
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < arr.length; i++){
                sb.append(Character.toUpperCase(arr[i].charAt(0)));
                sb.append(arr[i].substring(1).toLowerCase());
                sb.append(" ");
            }
            System.out.println(sb);
        }
    }
}
