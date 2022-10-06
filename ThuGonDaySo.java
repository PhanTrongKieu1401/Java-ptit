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
public class ThuGonDaySo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        ArrayList<Integer> list=new ArrayList<>();
        list.add(a[0]);
        for(int i=1;i<n;i++){
            if(list.size()==0)
                list.add(a[i]);
            else{
                if((list.get(list.size()-1)+a[i])%2==0)
                    list.remove(list.size()-1);
                else
                    list.add(a[i]);
            }
        }
        System.out.println(list.size());
    }
}
