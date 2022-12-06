/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07050_SapXepMatHang;

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
        Scanner sc = new Scanner(new File("MATHANG.in"));
        int test = Integer.parseInt(sc.nextLine());
        List<MatHang> lmh = new LinkedList<>();
        while(test-->0){
            MatHang mh = new MatHang(sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()));
            lmh.add(mh);
        }
        Collections.sort(lmh);
        for(MatHang i:lmh){
            System.out.println(i);
        }
    }
}
