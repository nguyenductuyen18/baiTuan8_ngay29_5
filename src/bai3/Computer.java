package bai3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Computer {
    int id;
    String hangSanXuat;
    double cauHinh;
    Boolean trangThai;
    public Computer(){}
    public Computer(int id,String hangSanXuat,double cauHinh,Boolean trangThai){
        this.id=id;
        this.hangSanXuat=hangSanXuat;
        this.cauHinh=cauHinh;
        this.trangThai=trangThai;

    }
    @Override
    public String toString(){
        return "id  "+id+ "     hangSanXuat"+hangSanXuat+"    cauHinh "+cauHinh+"    trangThai"+trangThai;
    }

    File file = new File("C:\\Users\\acer\\IdeaProjects\\kiemTra29_5_Tuan8\\src\\bai3\\ad.txt");

    public static void main(String[] args) throws IOException {

       Computer computer = new Computer(5,"tuyen",5.2,true);

    }




    }
//    public static String addComputerToArray(File file ){
//
//    }




/*   khởi tạo không tham số khởi tạo 1 mảng máy tính có độ dài bằng 0
            ● Phương thức thêm 1 máy tính vào danh sách addComputerToArray()
● Phương thức lưu 1 máy tính vào file addComputerToFile()
● Phương thức trả về thông tin của 1 file getDataFromFile()
● Phương thức lưu danh sách máy tính vào file addComputersToFile()
● Phương thức đọc và trả về danh sách máy tính trong file getAllComputerFromFile()
    Xây dựng lớp AppComputer chứa hàm main() để thực thi các yêu cầu sau:
            ● Tạo file có tên database.txt
● Tạo 5 máy tính với thông tin khác nhau
● 1 đối tượng:
            ○ Lưu từng đối tượng vào file database.txt sử dụng phương thức
    addComputerToFile() đã xây dựng ở trên;
○ Hiển thị đối tượng của file database.txt sử dụng phương thức
    getComputerFromFile();
● Mảng đối tượng
○ Lưu từng đối tượng vào mảng danh sách sinh viên sử dụng phương thức
    addComputerToArray();
○ Lưu mảng đối tượng sinh viên vào file database.txt sử dụng phương thức
    addComputersToFile();
○ Hiển thị tất cả thông tin của file database.txt sử dụng phương thức
    getAllComputerFromFile();*/
}
