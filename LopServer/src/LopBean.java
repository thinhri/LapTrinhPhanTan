
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
public class LopBean implements Serializable {

    private String MaLop;
    private String TenLop;


    private long dem;
    private double tbc;

    public LopBean() {
        super();
    }

    public LopBean(String MaLop, String TenLop, long dem, double tbc) {
        super();
        this.MaLop = MaLop;
        this.TenLop = TenLop;
        this.dem = dem;
        this.tbc = tbc;
    }

    public String getMaLop() {
        return MaLop;
    }

    public void setMaLop(String MaLop) {
        this.MaLop = MaLop;
    }

    public String getTenLop() {
        return TenLop;
    }

    public void setTenLop(String TenLop) {
        this.TenLop = TenLop;
    }
    
        public long getDem() {
        return dem;
    }

    public void setDem(long dem) {
        this.dem = dem;
    }

    public double getTbc() {
        return tbc;
    }

    public void setTbc(double tbc) {
        this.tbc = tbc;
    }

}
