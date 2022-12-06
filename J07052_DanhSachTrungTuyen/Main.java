/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07052_DanhSachTrungTuyen;

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
        Scanner sc = new Scanner(new File("THISINH.in"));
        int test = Integer.parseInt(sc.nextLine());
        List<ThiSinh> lts = new LinkedList<>();
        while(test-->0){
            ThiSinh ts = new ThiSinh(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            lts.add(ts);
        }
        int sltt = Integer.parseInt(sc.nextLine());
        Collections.sort(lts);
        double diemTrungTuyen = lts.get(sltt-1).getDiemTong();
        System.out.println(diemTrungTuyen);
        for(ThiSinh i:lts){
            if(i.getDiemTong() >= diemTrungTuyen)
                System.out.println(i + " TRUNG TUYEN");
            else
                System.out.println(i + " TRUOT");
        }
    }
}
