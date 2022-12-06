/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07050_SapXepMatHang;

/**
 *
 * @author DELL
 */
public class MatHang implements Comparable<MatHang>{
    private String maMH,tenMH,nhomMH;
    private float giaMua,giaBan,lai;
    private static int id=1;
    
    public MatHang(String tenMH, String nhomMH, float giaMua, float giaBan) {
        this.maMH = "MH" + String.format("%02d", id++);
        this.tenMH = tenMH;
        this.nhomMH = nhomMH;
        this.lai = giaBan - giaMua;
    }

    
    @Override
    public String toString() {
        return this.maMH + " " + this.tenMH + " " + this.nhomMH + " " + String.format("%.2f", this.lai);
    }   

    @Override
    public int compareTo(MatHang o) {
        if(this.lai > o.lai) return -1;
        else return 1;
    }
   
}
