package tuan1;

import java.util.Scanner;
import java.util.*;
import java.lang.*;
public class BaiTap12 {

	public static void main(String[] args) throws Exception {
		System.out.println("Họ tên: Lưu Thị Lương ");
        System.out.println("MSSV: 20181067");
        System.out.println("Lớp: SPKT-CNTT");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập N=");
        int n = scanner.nextInt();
        while (nhap(n)){
            System.out.println("Nhập sai vui lòng nhập lại");
            System.out.println("Nhập N=");
            n = scanner.nextInt();
        }
        for(int i=1; i<=n; i++) {
        	for(int j=1; j<=i; j++) {
        		System.out.print("* ");
        	}
        	System.out.println("");
        }
       
	}
	public static boolean nhap(int n){
        if( (n>=2) && (n<=10)){
            return false;
        }
        else{
            return true;
        }
    }
	
}
