/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07056_TinhTienDien;

/**
 *
 * @author DELL
 */
public class KhachHang implements Comparable<KhachHang>{
    private static int id = 1;
    private String maKH,tenKH,khuVuc;
    private int soDien,dinhMuc,tienTrongDM,tienVuotDM,thueVat,tongTien;

    public KhachHang(String tenKH, String thongTin) {
        String[] tmp = thongTin.split("\\s+");
        this.maKH = "KH" +String.format("%02d", id++);
        this.tenKH = chuanHoa(tenKH);
        this.khuVuc = tmp[0];
        this.dinhMuc = dinhMuc();
        this.soDien = Integer.parseInt(tmp[2]) - Integer.parseInt(tmp[1]);
        this.tienTrongDM = tienTrongDM();
        this.tienVuotDM = tienVuotDM();
        this.thueVat = thueVat();
        this.tongTien = tongTien();
    }

    private String chuanHoa(String tenKH) {
        StringBuilder sb = new StringBuilder();
        String[] tmp = tenKH.toLowerCase().trim().split("\\s+");
        for(String i:tmp){
            sb.append(Character.toUpperCase(i.charAt(0)));
            for(int j = 1; j < i.length(); j++)
                sb.append(Character.toLowerCase(i.charAt(j)));
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString().trim();
    }

    @Override
    public String toString() {
        return maKH + " " + tenKH + " " + tienTrongDM() + " " + tienVuotDM() + " " + thueVat() + " " + tongTien();
    }

    private int dinhMuc() {
        if(khuVuc.equals(Character.toString('A')))
            return 100;
        else{
            if(khuVuc.equals(Character.toString('B')))
                return 500;
            else
                return 200;
        }
    }
    
    private int tienTrongDM() {
        int tmp=0;
        if(this.soDien > this.dinhMuc)
            return this.dinhMuc * 450;
        else
            return this.soDien * 450;
    }

    private int tienVuotDM() {
        int tmp=0;
        if(this.soDien > this.dinhMuc){
            tmp = this.soDien - this.dinhMuc;
            return tmp * 1000;
        }
        return tmp;
    }

    private int thueVat() {
        return tienVuotDM() * 1/20;
    }

    private int tongTien() {
        return tienTrongDM() + tienVuotDM() + thueVat();
    }       

    @Override
    public int compareTo(KhachHang o) {
        if(this.tongTien > o.tongTien)
            return -1;
        else return 1;
    }
}
