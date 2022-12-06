/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07054_TinhDiemTrungBinh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int test = Integer.parseInt(sc.nextLine());
        List<SinhVien> lsv = new LinkedList<>();
        while(test-->0){
            SinhVien sv = new SinhVien(sc.nextLine(),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()));
            lsv.add(sv);
        }
        Collections.sort(lsv);
        int thuHang = 1, cungHang = 1;
        System.out.println(lsv.get(0) + " 1");
        for(int i = 1; i < lsv.size(); i++){
            if(lsv.get(i).getDiemTB() == lsv.get(i-1).getDiemTB()){
                System.out.println(lsv.get(i) + " " + thuHang);
                cungHang++;
            }
            else{
                thuHang += cungHang;
                cungHang = 1;
                System.out.println(lsv.get(i) + " " + thuHang);
            }
        }
    }
}
