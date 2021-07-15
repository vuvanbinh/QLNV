public abstract class  NhanVien {
    private String ten;
    private String code;
    private int tuoi;
    private int sdt;
    private String email;

    public NhanVien(){};

    public NhanVien(String ten, String code, int tuoi, int sdt, String email) {
        this.ten = ten;
        this.code = code;
        this.tuoi = tuoi;
        this.sdt = sdt;
        this.email = email;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getSdt() {
        return sdt;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public abstract double getLuong();



    @Override
    public String toString() {
        return "NhanVien{" +
                "ten='" + ten + '\'' +
                ", code='" + code + '\'' +
                ", tuoi=" + tuoi +
                ", sdt=" + sdt +
                ", email='" + email + '\'' +
                '}';
    }
}
