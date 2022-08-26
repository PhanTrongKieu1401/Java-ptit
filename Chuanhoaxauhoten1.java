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
public class Chuanhoaxauhoten1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        sc.nextLine();
        while(test-->0){
            String s=sc.nextLine();// nhập cả dấu cách
            System.out.println(Chuanhoa(s));//in chuỗi kết quả của hàm Chuanhoa
        }
    }
    public static String Chuanhoa(String s) { //khởi tạo hàm Chuanhoa trả về String
        StringTokenizer st=new StringTokenizer(s);// tạo lớp StringTokenizer với chuỗi st
        StringBuilder kq=new StringBuilder();// tạo 1 builder với chuỗi kq(giống xd chuỗi)
        while(st.hasMoreTokens()){ // còn dấu cách thì còn thực hiện
            String t=st.nextToken(); //trả về chuỗi kí tự không chứa dấu cách tiếp theo trong st
            kq.append(Character.toUpperCase(t.charAt(0)));
            for(int i=1;i<t.length();i++){
                kq.append(Character.toLowerCase(t.charAt(i)));
            }
            kq.append(" ");
        }
        return kq.toString().trim();
    }
}
