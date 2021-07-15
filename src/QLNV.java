public class QLNV {
    static NhanVien[] nhanViens = new NhanVien[5];

    public QLNV() {
    }

    public QLNV(NhanVien[] nhanViens) {
        this.nhanViens = nhanViens;
    }

    public NhanVien[] getNhanViens() {
        return nhanViens;
    }

    public void setNhanViens(NhanVien[] nhanViens) {
        this.nhanViens = nhanViens;
    }

    public void showAll(){
        for (NhanVien t: nhanViens
             ) {
            System.out.println(t);
        }
    }
    public double tongLuong(){
        double sum = 0;
        for (NhanVien t: nhanViens
             ) {
            sum+= t.getLuong();
        }
        return sum;
    }

    public void addNhanVien(NhanVien newNhanVien){
        NhanVien[] newlist = new NhanVien[nhanViens.length+1];
        for (int i = 0; i < nhanViens.length; i++) {
            newlist[i]=nhanViens[i];
        }
        newlist[nhanViens.length]= newNhanVien;
        setNhanViens(newlist);
    }

    public double getLuongTB (){
        return  tongLuong()/nhanViens.length;

    }
    public NhanVien nvFullTimeLuongThap(){
        for (int i = 0; i < nhanViens.length; i++) {
            if (nhanViens[i].getLuong()<getLuongTB())
                return nhanViens[i];
        }
        return null;
    }


}
