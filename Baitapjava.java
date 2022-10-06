/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitapjava;

import java.io.*;


/**
 *
 * @author DELL
 */
public class Baitapjava {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        FileInputStream in=new FileInputStream("DATA.in");
        FileOutputStream out=new FileOutputStream("Out.txt");
        int x=0;
        while(true){
            x=in.read();
            if(x==-1)
                break;
            out.write(x);
        }
        out.close();
    }
    
}
