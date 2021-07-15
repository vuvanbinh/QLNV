
public class NvFullTime  extends NhanVien{
    private int thuong;
    private int phat;
    private int luongCB;

    public NvFullTime() {
    }

    @Override
    public double getLuong() {
        return luongCB+thuong-phat;
    }

    public NvFullTime(int thuong, int phat, int luongCB) {
        this.thuong = thuong;
        this.phat = phat;
        this.luongCB = luongCB;
    }

    public NvFullTime(String ten, String code, int tuoi, int sdt, String email, int thuong, int phat, int luongCB) {
        super(ten, code, tuoi, sdt, email);
        this.thuong = thuong;
        this.phat = phat;
        this.luongCB = luongCB;
    }

    public int getThuong() {
        return thuong;
    }

    public void setThuong(int thuong) {
        this.thuong = thuong;
    }

    public int getPhat() {
        return phat;
    }

    public void setPhat(int phat) {
        this.phat = phat;
    }

    public int getLuongCB() {
        return luongCB;
    }

    public void setLuongCB(int luongCB) {
        this.luongCB = luongCB;
    }


    @Override
    public String toString() {
        return super.toString()+ ", NvFullTime{" +
                "thuong=" + thuong +
                ", phat=" + phat +
                ", luongCB=" + luongCB +
                '}';
    }
}
