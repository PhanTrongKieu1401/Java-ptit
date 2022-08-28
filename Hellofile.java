/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapjava;

/**
 *
 * @author DELL
 */
import java.io.*;
import java.util.*;
public class Hellofile {
    public static void main(String[] args) throws FileNotFoundException{
        File file=new File("Hello.txt");
        Scanner sc=new Scanner(file);
        while(sc.hasNextLine())
            System.out.println(sc.nextLine());
    }
}
