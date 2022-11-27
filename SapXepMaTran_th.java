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
public class SapXepMaTran_th {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("MATRIX.in"));
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int i=sc.nextInt();
            int[][] a=new int[n+1][m+1];
            ArrayList<Integer> kq=new ArrayList<>();
            for(int x=0;x<n;x++){
                for(int y=0;y<m;y++){
                    a[x][y]=sc.nextInt();
                    if(y==i-1)
                        kq.add(a[x][y]);
                }
            }
            Collections.sort(kq);
            for(int x=0;x<n;x++){
                for(int y=0;y<m;y++){
                    if(y!=i-1){
                        System.out.print(a[x][y]+" ");
                    }
                    else{
                        System.out.print(kq.get(x)+" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
