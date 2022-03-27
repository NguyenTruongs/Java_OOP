package xuantruong_qlbhcns;

import java.util.Scanner;

public class XuanTruong_HangHoa implements XuanTruong_HangHoa_Interface {
    private String maHangHoa;
    private String loaiHangHoa;
    private float giaBan;

    public XuanTruong_HangHoa() {
    }

    public XuanTruong_HangHoa(String maHangHoa, String loaiHangHoa, float giaBan) {
        this.maHangHoa = maHangHoa;
        this.loaiHangHoa = loaiHangHoa;
        this.giaBan = giaBan;
    }

    public String getMaHangHoa() {
        return maHangHoa;
    }

    public boolean setMaHangHoa(String maHangHoa) {
        if (maHangHoa != null && maHangHoa.length() <= 8) {
            this.maHangHoa = maHangHoa;
            return true;
        } else {
            return false;
        }
    }

    public String getLoaiHangHoa() {
        return loaiHangHoa;
    }

    public boolean setLoaiHangHoa(String loaiHangHoa) {
        if (loaiHangHoa != null && loaiHangHoa.equals("SACH") || loaiHangHoa.equals("sach") || loaiHangHoa.equals("Sach") ||
                loaiHangHoa.equals("SÁCH") || loaiHangHoa.equals("sách") || loaiHangHoa.equals("Sách")) {
            this.loaiHangHoa = loaiHangHoa;
            return true;
        } else {
            return false;
        }
    }

    public float getGiaBan() {
        return giaBan;
    }

    public boolean setGiaBan(float giaBan) {
        if (giaBan >= 10000) {
            this.giaBan = giaBan;
            return true;
        } else {
            return false;
        }
    }

    public void Input() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Mã hàng hóa chỉ đối đa chứa 8 ký tự lơn hơn 8 thì vui lòng nhập lại
            try {
                System.out.print(" Nhập mã hàng hóa : ");
                String maHangHoa = scanner.nextLine();
                boolean check = setMaHangHoa(maHangHoa);
                if (check == true) {
                    break;
                } else {
                    System.err.println("Mã hàng hóa <= 8 ký tự");
                }
            } catch (Exception exception) {
                System.out.println(" Nhập mã hàng hóa");
            }
        }

        // Loại hàng hóa chỉ có là SÁCH nếu nhập sai vui lòng nhập lại
        while (true) {
            try {
                System.out.print(" Nhập loại hàng hóa : ");
                String loaiHangHoa = scanner.nextLine();
                boolean check = setLoaiHangHoa(loaiHangHoa);
                if (check == true) {
                    break;
                } else {
                    System.err.println("Loại hàng hóa trong thư viện chỉ có sách");
                }
            } catch (Exception exception) {
                System.out.println(" Nhập lại loại hàng hóa");
            }
        }

        //Giá bán 1 quyển sách phải >= 10000 nếu không lớn hơn nhập lại cho đúng
        while (true) {
            try {
                System.out.print(" Nhập giá bán : ");
                float giaBan = scanner.nextFloat();
                boolean check = setGiaBan(giaBan);
                if (check == true) {
                    break;
                } else {
                    System.err.println("Giá phải lớn hơn 10000");
                }
            } catch (Exception exception) {
                System.out.println(" Nhập lại giá");
            }
        }
    }

    // display
    public void Output() {
        System.out.println(" ");
        System.out.println(" Mã hàng hóa : " + getMaHangHoa() +
                " || Loại hàng hóa : " + getLoaiHangHoa() +
                " || Giá bán : " + getGiaBan() );
    }

    @Override
    public String toString() {
        return "XuanTruong_HangHoa{" +
                "maHangHoa='" + maHangHoa + '\'' +
                ", loaiHangHoa='" + loaiHangHoa + '\'' +
                ", giaBan=" + giaBan +'\'' +
                '}';
    }
}
