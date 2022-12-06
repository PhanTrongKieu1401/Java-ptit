/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07048_DanhSachSanPham_2;

/**
 *
 * @author DELL
 */
public class SanPham implements Comparable<SanPham>{
    private String maSP,tenSP;
    private Long giaSP,baoHanhSP;

    public SanPham(String maSP, String tenSP, Long giaSP, Long baoHanhSP) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.giaSP = giaSP;
        this.baoHanhSP = baoHanhSP;
    }

    public int compareTo(SanPham o){
        if(this.giaSP == o.giaSP)
            return this.maSP.compareTo(o.maSP);
        else
            if(this.giaSP > o.giaSP)
                return -1;
            else
                return 1;
    }
    
    @Override
    public String toString() {
        return maSP + " " + tenSP + " " + giaSP + " " + baoHanhSP;
    }    
}
