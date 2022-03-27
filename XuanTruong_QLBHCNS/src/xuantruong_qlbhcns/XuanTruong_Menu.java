package xuantruong_qlbhcns;

import java.util.*;

public class XuanTruong_Menu {

    static ArrayList<XuanTruong_Sach> sachArrayList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public void add() {
        System.out.print("Số sách muốn nhập : ");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            XuanTruong_Sach sach = new XuanTruong_Sach();
            sach.Input();
            sachArrayList.add(sach);
        }
    }

    public void displaySach() {
        for (int i = 0; i < sachArrayList.size(); i++) {
            sachArrayList.get(i).Output();
        }
    }

    public void hienThiThongTinMaHH() {
        System.out.println(" Nhập mã hàng hóa muốn đưa ra thông tin");
        String maHH = scanner.nextLine();
        System.out.print(maHH);

        for (int i = 0; i < sachArrayList.size(); i++) {
            if (sachArrayList.get(i).getMaHangHoa().contains(maHH)) {
                sachArrayList.get(i).Output();
            }
        }
    }

    public void sortGiaBanGiamDan() {
        //DESC
        Collections.sort(sachArrayList, new Comparator<XuanTruong_Sach>() {
            @Override
            public int compare(XuanTruong_Sach sach1, XuanTruong_Sach sach2) {
                return (int) (sach2.getGiaBan() - sach1.getGiaBan());
            }
        });

        for (int i = 0; i < sachArrayList.size(); i++) {
            sachArrayList.get(i).Output();
        }

    }

    public void sortGiaBanTangDan() {
        //ASC
        Collections.sort(sachArrayList, new Comparator<XuanTruong_Sach>() {
            @Override
            public int compare(XuanTruong_Sach sach1, XuanTruong_Sach sach2) {
                return (int) (sach1.getGiaBan() - sach2.getGiaBan());
            }
        });

        for (int i = 0; i < sachArrayList.size(); i++) {
            sachArrayList.get(i).Output();
        }
    }

    public void cacQuyenSachCoGiaCaoNhat() {
        float max = sachArrayList.get(0).getGiaBan();
        for (int i = 0; i < sachArrayList.size(); i++) {
            if (sachArrayList.get(i).getGiaBan() > max) {
                max = sachArrayList.get(i).getGiaBan();
                sachArrayList.get(i).Output();
            }
        }
    }

    public void sachCoGiaThapNhatOViTriDauTien() {
        Collections.sort(sachArrayList, new Comparator<XuanTruong_Sach>() {
            @Override
            public int compare(XuanTruong_Sach sach1, XuanTruong_Sach sach2) {
                return (int) (sach1.getGiaBan() - sach2.getGiaBan());
            }
        });

        for (int i = 0; i < sachArrayList.size(); i++) {
            if (i==0 ){
                sachArrayList.get(i).Output();
            }
        }

    }

    public void delete(int n) {
        for (int i = 0; i < sachArrayList.size(); i++) {
            if (i == (n - 1)) {
                sachArrayList.remove(n - 1);
            } else {
                try {

                } catch (Exception exception) {
                    System.err.println("Lỗi");
                }
            }
        }
    }


    public void edit(int a) {
        for (int i = 0; i < sachArrayList.size(); i++) {
            if (i == (a - 1)) {
                XuanTruong_Sach sach = new XuanTruong_Sach();
                sach.Input();
                sachArrayList.set(a - 1, sach);
            }
        }
    }

    public void thanhToan() {
        System.out.println(" Nhập ID sách của bạn để hiển thị hóa đơn : ");
        String X = scanner.nextLine();
        System.out.print(X);
        for (int i = 0; i < sachArrayList.size(); i++) {
            if (sachArrayList.get(i).getID_Sach().contains(X)) {
                sachArrayList.get(i).display_TienBanSach();
            }

        }
    }


}
