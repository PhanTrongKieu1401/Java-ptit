/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapjava;

import java.util.*;
/**
 *
 * @author DELL
 */
public class ChuanHoaXauHoTen2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String xau=sc.nextLine();
            xau=chuanhoa(xau);
            tach(xau);
        }
    }

    private static String chuanhoa(String xau) {
        StringTokenizer st=new StringTokenizer(xau);
        StringBuilder kq=new StringBuilder();
        int dem=0;
        while(st.hasMoreTokens()){
            String s=st.nextToken();
            if(dem==0){
                for(int i=0;i<s.length();i++){
                    kq.append(Character.toUpperCase(s.charAt(i)));
                }
                kq.append(" ");
            }
            else{
                kq.append(Character.toUpperCase(s.charAt(0)));
                for(int i=1;i<s.length();i++){
                    kq.append(Character.toLowerCase(s.charAt(i)));
                }
                kq.append(" ");
            }
            dem++;
        }
        return kq.toString().trim();
    }
    
    private static void tach(String xau) {
        StringTokenizer st=new StringTokenizer(xau);
        StringBuilder kq=new StringBuilder();
        List<String> a=new ArrayList<>();
        while(st.hasMoreTokens()){
            String s=st.nextToken();
            a.add(s);
        }
        
        for(int i=1;i<a.size();i++){
            if(i==a.size()-1)
                System.out.print(a.get(i)+", ");
            else
                System.out.print(a.get(i)+" ");
        }
        System.out.println(a.get(0));
    }
}
