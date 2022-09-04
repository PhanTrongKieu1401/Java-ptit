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
import java.math.BigInteger;

public class Tinhluythua {

    static long hang = 10 ^ 9 + 7;

    public static long luythua(long n, long m) {
        if (m == 0) {
            return 1;
        }
        long x = luythua(n, m / 2);
        x = x * x % hang;
        if (m % 2 == 0) {
            return x;
        }
        return (n * x) % hang;
    }
    static final BigInteger M = BigInteger.valueOf((int) 1e9 + 7);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        long a=sc.nextLong();
//        long b=sc.nextLong();
        while (true) {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
//        while (a != 0 || b != 0) {
//            System.out.println(luythua(a, b));
//            a = sc.nextLong();
//            b = sc.nextLong();
//        }
            if (a.equals(BigInteger.valueOf(0)) && b.equals(BigInteger.valueOf(0))) {
                break;
            }
            System.out.println(a.modPow(b, M));
        }
    }
}
