/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapjava;

/**
 *
 * @author DELL
 */
import java.util.*;

public class HinhVuong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt(), d = in.nextInt(), x = in.nextInt(), y = in.nextInt(), z = in.nextInt(), t = in.nextInt(), A;
        A = Math.max(Math.max(Math.abs(x - c), Math.abs(y - d)), Math.max(Math.abs(z - a), Math.abs(t - b)));
        A = Math.max(A, Math.max(Math.max(Math.abs(z - x), Math.abs(t - y)), Math.max(Math.abs(a - c), Math.abs(b - d))));
        System.out.println(A * A);
    }
}
