/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07051_TinhTienPhong;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int test = Integer.parseInt(sc.nextLine());
        List<KhachHang> lkh = new LinkedList<>();
        while(test-->0){
            String tenKH = sc.nextLine();
            String soPhong = sc.nextLine();
            String ngayNhan = sc.nextLine();            
            String ngayTra = sc.nextLine();
            int dichVu = Integer.parseInt(sc.nextLine());           
            KhachHang kh = new KhachHang(tenKH,soPhong,ngayNhan,ngayTra,dichVu);
            kh.chuanHoaTen();
            lkh.add(kh);
        }
        Collections.sort(lkh);
        for(KhachHang i:lkh){
            System.out.println(i);
        }
    }
}
