
public class NvPartTime extends NhanVien {
    private int time;

    public NvPartTime() {
    }

    @Override
    public double getLuong() {
        return time * 10;
    }

    public NvPartTime(int time) {
        this.time = time;
    }

    public NvPartTime(String ten, String code, int tuoi, int sdt, String email, int time) {
        super(ten, code, tuoi, sdt, email);
        this.time = time;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return super.toString()+ ", NvPartTime{" +
                "time=" + time +
                '}';
    }
}
