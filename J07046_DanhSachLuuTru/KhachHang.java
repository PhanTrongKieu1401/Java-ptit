/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07046_DanhSachLuuTru;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author DELL
 */
public class KhachHang implements Comparable<KhachHang>{
    private static int id=1;
    private String name,map,makh;
    private String dc,dl;
    private Long time;

    public KhachHang(String name, String map, String dc, String dl) throws ParseException{
        this.makh = "KH" + String.format("%02d", id++);
        this.name = name;
        this.map = map;   
        Date datec = new SimpleDateFormat("dd/MM/yyyy").parse(dc);
        Date datel = new SimpleDateFormat("dd/MM/yyyy").parse(dl);
        this.time = (datel.getTime() - datec.getTime())/(1000*60*60*24);;
    }
    
    public String toString(){
        return makh + " " + name + " " + map + " " + time;
    }
    
    public int compareTo(KhachHang o){
        return -time.compareTo(o.time);
    }       
}
