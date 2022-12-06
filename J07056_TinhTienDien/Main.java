/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07056_TinhTienDien;

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
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int test = Integer.parseInt(sc.nextLine());
        List<KhachHang> lkh = new LinkedList<>();
        while(test-->0){
            KhachHang kh = new KhachHang(sc.nextLine(),sc.nextLine());           
            lkh.add(kh);
        }
        Collections.sort(lkh);
        for(KhachHang i:lkh){
            System.out.println(i);
        }
    }
}
