package tuan2_3;
import java.util.Scanner;
public class BaiTap3 {

	public static void main(String[] args) {
		System.out.println("Họ tên: Lưu Thị Lương ");
        System.out.println("MSSV: 20181067");
        System.out.println("Lớp: SPKT-CNTT");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số:");
        int n = scanner.nextInt();
        float kq =0;
        float j =0;
        float k =1;
        for(int i=1 ; i <=n ; i++){
            k*=i;
            j+=k;
            kq+=(float)(1/j);
        }
        
        System.out.println("Kết quả: "+kq);
	}

}