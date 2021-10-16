package tuan2_3;
import java.util.*;
public class BaiTap4 {

	public static void main(String[] args) {
		System.out.println("Họ tên: Lưu Thị Lương ");
        System.out.println("MSSV: 20181067");
        System.out.println("Lớp: SPKT-CNTT");
		Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số:");
        int n = scanner.nextInt();
        int kq = Fibonaxi(n);
        System.out.println("Kết quả: "+kq);
	}
	public static int Fibonaxi(int k){
        if(k==1){
            return 1;
        }
        else if(k==0){
            return 0;
        }
        else{
            return Fibonaxi(k-1)+Fibonaxi(k-2);
        }
	}
}
