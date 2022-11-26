/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapjava;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class DiaChiEmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map <String, Integer> map = new HashMap<>();
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            s = s.trim();
            String[] arr = s.split("\\s+");
            StringBuilder email = new StringBuilder();
            
            email.append(arr[arr.length - 1].toLowerCase());
            for(int i = 0; i < arr.length - 1; i++) {
                email.append(Character.toLowerCase(arr[i].charAt(0)));
            }
            String tmp = email.toString();
            if(map.containsKey(tmp)){
                int ts = map.get(tmp);
                ++ts;
                System.out.println("" + tmp + ts + "@ptit.edu.vn");
                map.put(tmp, ts);
            }
            else{
                System.out.println(tmp + "@ptit.edu.vn");
                map.put(tmp, 1);
            }
        }
    }
}
