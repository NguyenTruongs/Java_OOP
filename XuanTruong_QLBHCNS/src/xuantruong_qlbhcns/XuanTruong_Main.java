package xuantruong_qlbhcns;

import java.util.ArrayList;
import java.util.Scanner;

public class XuanTruong_Main {
    static ArrayList<XuanTruong_Sach> sachArrayList = new ArrayList<XuanTruong_Sach>();
    static Scanner scanner = new Scanner(System.in);
    static XuanTruong_Menu menu = new XuanTruong_Menu();
    static XuanTruong_Sach sach = new XuanTruong_Sach();
    public static void main(String[] args) {
        while (true) {
            menu();
            System.out.print(" Chọn Case :");
            int chon = scanner.nextInt();
            switch (chon) {
                case 1:
                    menu.add();
                    break;

                case 2:
                    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t________ Danh sách ________");
                    menu.displaySach();
                    break;

                case 3:
                    menu.hienThiThongTinMaHH();
                    break;

                case 4:
                    menu.sortGiaBanGiamDan();
                    break;

                case 5:
                    menu.sortGiaBanTangDan();
                    break;

                case 6:
                    menu.cacQuyenSachCoGiaCaoNhat();
                    break;

                case 7:
                    menu.sachCoGiaThapNhatOViTriDauTien();
                    break;

                case 8:
                    System.out.print("Nhập số muốn xóa");
                    int n = scanner.nextInt();
                     menu.delete(n);
                    break;

                case 9 :
                    System.out.print("Nhập số muốn sửa");
                    int a = scanner.nextInt();
                    menu.edit(a);
                    break;
                case 10:
                    menu.thanhToan();
                    break;
            }
        }
    }

    public static void menu() {
        System.out.println(" ");
        System.out.println("|-------------|");
        System.out.println("|     MENU    |");
        System.out.println("|-------------|");
        System.out.println("1. Thêm sách ");
        System.out.println("2. Hiển thị sách ");
        System.out.println("3. Tìm kiếm hiển thị thông tin mã hàng hóa nhập từ vào từ bàn phím ");
        System.out.println("4. Sắp xếp theo chiều giảm dần của giá bán sách ");
        System.out.println("5. Sắp xếp theo chiều tăng dần của giá bán sách ");
        System.out.println("6. Hiển thị các quyển sách có mức giá lớn hơn quyển sách nhỏ nhất ");
        System.out.println("7. Hiển thị quyển sách có mức giá nhỏ nhất ở vị trí đầu tiên ");
        System.out.println("8. Xóa sách thông tin sách ");
        System.out.println("9. Sửa sách thông tin sách ");
        System.out.println("10. Hóa đơn thanh toán ");
    }
}
