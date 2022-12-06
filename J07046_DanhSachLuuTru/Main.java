/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07046_DanhSachLuuTru;

import java.io.*;
import java.text.*;
import java.util.*;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("KHACH.in"));
        int test = Integer.parseInt(sc.nextLine());
        List<KhachHang> lkh = new LinkedList<>();
        while(test-->0){
            String name = sc.nextLine();
            String map = sc.nextLine();
            String dc = sc.nextLine();
            String dl = sc.nextLine();
            KhachHang kh = new KhachHang(name,map,dc,dl);
            lkh.add(kh);
        }
        Collections.sort(lkh);
        for(KhachHang i:lkh)
            System.out.println(i);
    }
}
