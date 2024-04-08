
import java.io.Serializable;

public class DonViBean implements Serializable{

    private String madonvi;
    private String tendonvi;
    private double tbc;


    public DonViBean(String madonvi, String tendonvi, double tbc) {
        super();
        this.madonvi = madonvi;
        this.tendonvi = tendonvi;
        this.tbc = tbc;
    }

    public String getMadonvi() {
        return madonvi;
    }

    public void setMadonvi(String madonvi) {
        this.madonvi = madonvi;
    }

    public String getTendonvi() {
        return tendonvi;
    }

    public void setTendonvi(String tendonvi) {
        this.tendonvi = tendonvi;
    }

    public double getTbc() {
        return tbc;
    }

    public void setTbc(double tbc) {
        this.tbc = tbc;
    }
    
}
