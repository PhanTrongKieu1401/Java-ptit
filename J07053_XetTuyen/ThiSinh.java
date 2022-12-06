/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07053_XetTuyen;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author DELL
 */
public class ThiSinh {
    private static int id=1;
    private String maTS,tenTS,ngaySinh;
    //private Date ngaySinh;
    private float diemLT,diemTH;

    public ThiSinh(String tenTS, String ngaySinh, float diemLT, float diemTH) {
        this.maTS = "PH" + String.format("%02d", id++);
        this.tenTS = chuanHoa(tenTS);
        this.ngaySinh = ngaySinh; //new SimpleDateFormat().parse(ngaySinh);
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }

    @Override
    public String toString() {
        return maTS + " " + tenTS + " " + tinhTuoi() + " " + tinhDiem() + " " + xepLoai();
    }

    private String chuanHoa(String tenTS) {
        StringBuilder sb = new StringBuilder();
        String[] s = tenTS.toLowerCase().trim().split("\\s+");
        for(String i:s){
            sb.append(Character.toUpperCase(i.charAt(0)));
            for(int j = 1;j < i.length(); j++)
                sb.append(Character.toLowerCase(i.charAt(j)));
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString().trim();
    }
    
    private int tinhTuoi() {
        String[] s =this.ngaySinh.split("/");
        return 2021 - Integer.parseInt(s[s.length - 1]);
    }

    private int tinhDiem() {
        int tmp = 0;
        if(this.diemLT >= 8 && this.diemTH >= 8){
            tmp = Math.round((this.diemLT + this.diemTH)/2 + 1); 
        }
        else{
            if(this.diemLT >= 7.5 && this.diemTH >= 7.5){
                tmp = (int)Math.round(((this.diemLT + this.diemTH)/2 + 0.5));
            }
            else{
                tmp = Math.round((this.diemLT + this.diemTH)/2);
            }
        }
        if(tmp>10) tmp = 10;
        return tmp;
    }        

    private String xepLoai() {
        if(tinhDiem() == 9 || tinhDiem() == 10)
            return "Xuat sac";
        else{
            if(tinhDiem() == 8)
                return "Gioi";
            else{
                if(tinhDiem() == 7)
                    return "Kha";
                else{
                    if(tinhDiem() == 5 || tinhDiem() == 6)
                        return " Trung binh";
                    else return "Truot";
                }
            }
        }
    }
}
