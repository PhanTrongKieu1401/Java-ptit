/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07054_TinhDiemTrungBinh;

/**
 *
 * @author DELL
 */
public class SinhVien implements Comparable<SinhVien>{
    private static int id = 1;
    private String maSV,tenSV;
    private int diem1,diem2,diem3;
    private Float diemTB;

    public SinhVien(String tenSV, int diem1, int diem2, int diem3) {
        this.maSV = "SV" + String.format("%02d", id++);
        this.tenSV = chuanHoa(tenSV);  
        this.diemTB = (float)(diem1 * 3 + diem2 * 3 + diem3 * 2)/8; 
    }

    public float getDiemTB() {
        return diemTB;
    }

    @Override
    public String toString() {
        return maSV + " " + tenSV + " " + String.format("%.02f",diemTB) ;
    }

    private String chuanHoa(String tenSV) {
        StringBuilder sb = new StringBuilder();
        String[] tmp = tenSV.toLowerCase().trim().split("\\s+");
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
    public int compareTo(SinhVien o) {
        if(this.diemTB > o.diemTB)
            return -1;
        else{
            if(this.diemTB < o.diemTB)
                return 1;
            else return this.maSV.compareTo(o.maSV);
        }
    }
}
