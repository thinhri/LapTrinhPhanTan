
import java.io.Serializable;



public class TypeBean implements Serializable{
    
    private String maloai;
    private String tenloai;

    public TypeBean() {
        super();
    }

    public TypeBean(String maloai, String tenloai) {
        super();
        this.maloai = maloai;
        this.tenloai = tenloai;
    }

    public String getMaloai() {
        return maloai;
    }

    public void setMaloai(String maloai) {
        this.maloai = maloai;
    }

    public String getTenloai() {
        return tenloai;
    }

    public void setTenloai(String tenloai) {
        this.tenloai = tenloai;
    }
    
    
    
}
