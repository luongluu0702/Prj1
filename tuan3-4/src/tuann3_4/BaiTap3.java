package tuann3_4;
import java.util.*;
public class BaiTap3 {
	public static void main(String[] args) {
		System.out.println("Họ tên: Lưu Thị Lương ");
        System.out.println("MSSV: 20181067");
        System.out.println("Lớp: SPKT-CNTT");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài của dãy:");
        int n = scanner.nextInt();

        List<Integer> b = new ArrayList();
        System.out.println("Nhập dãy số : ");
        for(int i= 0 ; i<n;i++){
            int nhap = scanner.nextInt();
            b.add(nhap);
        }
       
        int min = b.get(0);
        int vitri= 0;
        for(int i= 0 ; i<n;i++){
        	if(min > b.get(i)) {
        		min= b.get(i);
        		vitri = i;
        	} else min= min;
        }
        System.out.println("Min : "+ min);
        System.out.println("Tại vị trí : "+ vitri);
    }
}
