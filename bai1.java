class HinhChuNhat {

    private double chieuDai;
    private double chieuRong;

    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double tinhChuVi() {
        return 2 * (chieuDai + chieuRong);
    }

    public double tinhDienTich() {
        return chieuDai * chieuRong;
    }

    public void hienThiThongTin() {
        System.out.println("Chiều dài: " + chieuDai);
        System.out.println("Chiều rộng: " + chieuRong);
        System.out.println("Chu vi: " + tinhChuVi());
        System.out.println("Diện tích: " + tinhDienTich());
        System.out.println("----------------------------");
    }
}

public class bai1 {
    public static void main(String[] args) {

        HinhChuNhat hcn1 = new HinhChuNhat(5, 3);
        HinhChuNhat hcn2 = new HinhChuNhat(10, 4);
        HinhChuNhat hcn3 = new HinhChuNhat(7.5, 2.5);

        hcn1.hienThiThongTin();
        hcn2.hienThiThongTin();
        hcn3.hienThiThongTin();
    }
}