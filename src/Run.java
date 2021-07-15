public class Run {
    public static void main(String[] args) {
        NvFullTime nvFullTime1 = new NvFullTime("Than", "c01",
                18, 01, "than@", 100, 100, 500);
        NvFullTime nvFullTime2 = new NvFullTime("Dai", "c02",
                20, 02, "Dai@", 100, 20, 500);
        NvFullTime nvFullTime3 = new NvFullTime("Trung", "c03",
                22, 03, "Trung@", 100, 30, 500);
        NvPartTime nvPartTime1 = new NvPartTime("Hanh", "Co4", 20, 002, "Hanh@", 15);
        NvPartTime nvPartTime2 = new NvPartTime("Cuong", "Co5", 20, 003, "Cuong@", 15);

        NhanVien[] nhanViens = {nvFullTime1, nvFullTime2, nvFullTime3, nvPartTime1, nvPartTime2};

        System.out.println("Danh sach nhan vien toan cong ti :");
        QLNV kieuAnh = new QLNV();
        kieuAnh.setNhanViens(nhanViens);
        kieuAnh.showAll();
        System.out.println("Tong luong nhan vien :");
        System.out.println(kieuAnh.tongLuong());

        NvPartTime nvPartTime3 = new NvPartTime("Van", "Co6", 20, 003, "Cuong@", 15);

        System.out.println("Danh sach sau khi them nhan vien moi :");
        kieuAnh.addNhanVien(nvPartTime3);
        kieuAnh.showAll();






    }
}
