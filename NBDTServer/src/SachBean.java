
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author USER
 */
public class SachBean implements Serializable {

    private String MaSach;
    private String TenSach;
    private long SoLuong;
    private long Gia;
    private String MaNhaXuatBan;

    public SachBean() {
        super();
    }

    public SachBean(String MaSach, String TenSach, long SoLuong, long Gia, String MaNhaXuatBan) {
        super();
        this.MaSach = MaSach;
        this.TenSach = TenSach;
        this.SoLuong = SoLuong;
        this.Gia = Gia;
        this.MaNhaXuatBan = MaNhaXuatBan;
    }

    public String getMaSach() {
        return MaSach;
    }

    public void setMaSach(String MaSach) {
        this.MaSach = MaSach;
    }

    public String getTenSach() {
        return TenSach;
    }

    public void setTenSach(String TenSach) {
        this.TenSach = TenSach;
    }

    public long getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(long SoLuong) {
        this.SoLuong = SoLuong;
    }

    public long getGia() {
        return Gia;
    }

    public void setGia(long Gia) {
        this.Gia = Gia;
    }

    public String getMaNhaXuatBan() {
        return MaNhaXuatBan;
    }

    public void setMaNhaXuatBan(String MaNhaXuatBan) {
        this.MaNhaXuatBan = MaNhaXuatBan;
    }

}
