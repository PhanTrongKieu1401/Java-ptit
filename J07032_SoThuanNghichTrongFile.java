/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VaoRaFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class J07032_SoThuanNghichTrongFile {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream oi1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        List<Integer> tmp1 = (ArrayList<Integer>) oi1.readObject();
        ObjectInputStream oi2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        List<Integer> tmp2 = (ArrayList<Integer>) oi2.readObject();
        int[] ans1 = new int[1000001];
        int[] ans2 = new int[1000001];
        for(int i:tmp1){
            if(check(i)){
                ans1[i]++;
            }
        }
        for(int i:tmp2){
            if(check(i)){
                ans2[i]++;
            }
        }
        int dem = 0;
        for(int i = 11; i <1000000; i += 2){
            if(dem == 10)
                break;
            if(ans1[i] > 0 && ans2[i] > 0){
                System.out.println(i + " " + (ans1[i] + ans2[i]));
                dem++;
            }
        }
    }

    private static boolean check(int i) {
        String s = String.valueOf(i);
        if(s.length() == 1 || s.length() % 2 == 0)
            return false;
        for(int j = 0; j <= s.length() / 2;j++){
            if( (int)s.charAt(j) % 2 == 0)
                return false;
            if(s.charAt(j) != s.charAt(s.length() - j - 1))
                return false;
        }
        return true;
    }
}
