
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
public class NhaXuatBanBean implements Serializable {

    private String MaNhaXuatBan;
    private String TenNhaXuatBan;
    private double tbc;

    public NhaXuatBanBean() {
        super();
    }

    public NhaXuatBanBean(String MaNhaXuatBan, String TenNhaXuatBan, double tbc) {
        super();
        this.MaNhaXuatBan = MaNhaXuatBan;
        this.TenNhaXuatBan = TenNhaXuatBan;
        this.tbc = tbc;
    }

    public String getMaNhaXuatBan() {
        return MaNhaXuatBan;
    }

    public void setMaNhaXuatBan(String MaNhaXuatBan) {
        this.MaNhaXuatBan = MaNhaXuatBan;
    }

    public String getTenNhaXuatBan() {
        return TenNhaXuatBan;
    }

    public void setTenNhaXuatBan(String TenNhaXuatBan) {
        this.TenNhaXuatBan = TenNhaXuatBan;
    }

    public double getTbc() {
        return tbc;
    }

    public void setTbc(double tbc) {
        this.tbc = tbc;
    }

}
