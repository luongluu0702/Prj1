package tuann3_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BaiTap4 {
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
       
        int max = b.get(0);
        int vitri= 0;
        for(int i= 0 ; i<n;i++){
        	if(max < b.get(i)) {
        		max= b.get(i);
        		vitri = i;
        	} else max= max;
        }
        System.out.println("Max : "+ max);
        System.out.println("Tại vị trí : "+ vitri);
    }
}

