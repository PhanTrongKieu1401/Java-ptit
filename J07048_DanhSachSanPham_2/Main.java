/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07048_DanhSachSanPham_2;

import java.io.*;
import java.util.*;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        int test = Integer.parseInt(sc.nextLine());
        List<SanPham> lsp = new LinkedList<>();
        while(test-->0){
            SanPham sp = new SanPham(sc.nextLine(),sc.nextLine(),Long.parseLong(sc.nextLine()),Long.parseLong(sc.nextLine()));
            lsp.add(sp);
        }
        Collections.sort(lsp);
        for(SanPham i:lsp){
            System.out.println(i);
        }
    }
}
