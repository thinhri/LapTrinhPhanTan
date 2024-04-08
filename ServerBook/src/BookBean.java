
import java.io.Serializable;



public class BookBean implements Serializable{

    private String masach;
    private String tensach;
    private long gia;
    private long soluong;
    private String maloai;

    public BookBean() {
        super();
    }

    public BookBean(String masach, String tensach, long gia, long soluong, String maloai) {
        super();
        this.masach = masach;
        this.tensach = tensach;
        this.gia = gia;
        this.soluong = soluong;
        this.maloai = maloai;
    }

    public String getMasach() {
        return masach;
    }

    public void setMasach(String masach) {
        this.masach = masach;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public long getGia() {
        return gia;
    }

    public void setGia(long gia) {
        this.gia = gia;
    }

    public long getSoluong() {
        return soluong;
    }

    public void setSoluong(long soluong) {
        this.soluong = soluong;
    }

    public String getMaloai() {
        return maloai;
    }

    public void setMaloai(String maloai) {
        this.maloai = maloai;
    }

}
