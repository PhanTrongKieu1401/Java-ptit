/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07052_DanhSachTrungTuyen;

/**
 *
 * @author DELL
 */
public class ThiSinh implements Comparable<ThiSinh>{
    private String maTS, tenTS;
    private double toan,ly,hoa,diemTong, diemCong;

    public ThiSinh(String maTS, String tenTS, Double toan, Double ly, Double hoa) {
        this.maTS = maTS;
        this.tenTS = chuanHoa(tenTS);
        this.diemCong = diemCong();
        this.diemTong = toan * 2 + ly + hoa + this.diemCong;       
    }

    public double getDiemTong() {
        return diemTong;
    }   
    
    public static String chuanHoa(String s){
        StringBuilder sb = new StringBuilder();
        String[] tmp = s.toLowerCase().trim().split("\\s+");
        for(String i:tmp){
            sb.append(Character.toUpperCase(i.charAt(0)));
            for(int j = 1; j < i.length(); j++)
                sb.append(Character.toLowerCase(i.charAt(j)));
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString().trim();
    }

    public double diemCong(){        
        if(this.maTS.charAt(2) == '1')
            return 0.5;
        else
            if(this.maTS.charAt(2) == '2')
                return 1.0;
            else return 2.5;           
    }
    
    @Override
    public String toString() {
        String diemUuTien = this.diemCong + "";
        if (this.diemCong == (int) this.diemCong)
            diemUuTien = String.format("%.0f", this.diemCong);
        String diemXetTuyen = "";
        if(this.diemTong == (int)this.diemTong)
            diemXetTuyen = String.format("%.0f", this.diemTong);
        else
            diemXetTuyen = String.format("%.1f", this.diemTong);
        return maTS + " " + tenTS + " " + diemUuTien + " " + diemXetTuyen;
    }

    @Override
    public int compareTo(ThiSinh o) {
        if(this.diemTong == o.diemTong)
            return this.maTS.compareTo(o.maTS);
        else 
            if(this.diemTong > o.diemTong)
                return -1;
            else return 1;
    }
    
    
}
