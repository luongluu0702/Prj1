package tuan2_3;
import java.util.*;
public class BaiTap1 {

	public static void main(String[] args) {
		System.out.println("Họ tên: Lưu Thị Lương ");
        System.out.println("MSSV: 20181067");
        System.out.println("Lớp: SPKT-CNTT");
		Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số:");
        int n = scanner.nextInt();
        float kq =0;
        float j =0;
        for(int i=1 ; i <=n ; i++){
            j=j+i;
            kq+=(float)(1/j);
        }
        
        System.out.println("Kết quả: "+kq);
	}

}
