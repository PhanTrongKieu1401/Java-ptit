/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07051_TinhTienPhong;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author DELL
 */
public class KhachHang implements Comparable<KhachHang>{
    private static int id=1;
    private String maKH,tenKH,soPhong;
    private Date ngayNhan,ngayTra;
    private Integer tienDV,soNgayO;

    public KhachHang(String tenKH, String soPhong, String ngayNhan, String ngayTra, int tienDV) throws ParseException {
        this.maKH = "KH" + String.format("%02d", id++);
        this.tenKH = tenKH;       
        this.soPhong = soPhong.trim();
        this.ngayNhan = new SimpleDateFormat("dd/MM/yyyy").parse(chuanHoaNgay(ngayNhan));
        this.ngayTra = new SimpleDateFormat("dd/MM/yyyy").parse(chuanHoaNgay(ngayTra));
        this.soNgayO = soNgay();
        this.tienDV = tienPhong() + tienDV;
    }

    @Override
    public String toString() {       
        return maKH + " " + this.tenKH + " " + soPhong + " " + soNgayO + " " +tienDV;
    }

    public void chuanHoaTen(){
        StringBuilder sb = new StringBuilder();
        String[] tmp = this.tenKH.toLowerCase().trim().split("\\s+");
        for(String i:tmp){
            sb.append(Character.toUpperCase(i.charAt(0)));
            for(int j = 1;j < i.length(); j++)
                sb.append(Character.toLowerCase(i.charAt(j)));
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        this.tenKH = sb.toString().trim();
    }
    
    public String chuanHoaNgay(String s){
        StringBuilder sb = new StringBuilder(s);
        if(sb.charAt(2) != '/') sb.insert(0, "0");
        if(sb.charAt(5) != '/') sb.insert(3, "0");
        return sb.toString();
    }
    
    private int soNgay() throws ParseException {       
        return (int)((this.ngayTra.getTime() - this.ngayNhan.getTime())/(1000*60*60*24)) + 1;       
    }

    private int tienPhong() {   
        if(this.soPhong.charAt(0) == '1')
            return 25*this.soNgayO;
        else
            if(this.soPhong.charAt(0) == '2')
                return 34*this.soNgayO;
            else
                if(this.soPhong.charAt(0) == '3')
                    return 50*this.soNgayO;
                else
                    return 80*this.soNgayO;       
    }     

    @Override
    public int compareTo(KhachHang o) {
        if(this.tienDV > o.tienDV) return -1;
        else return 1;
    }
}
