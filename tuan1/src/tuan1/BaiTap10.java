package tuan1;
import java.util.*;
import java.lang.*;
public class BaiTap10 {
	public static void main(String[] args) {
	    	System.out.println("Họ tên: Lưu Thị Lương ");
	        System.out.println("MSSV: 20181067");
	        System.out.println("Lớp: SPKT-CNTT");
	        System.out.println("Kết quả: ");
	        System.out.print("Nhap N =");
	        int n = nhap();
	        lietKeUocSNT(n);
	    }
	public static int nhap() {
        Scanner input = new Scanner(System.in);
        boolean check = false;
        int n = 0;
        while (!check) {
            System.out.print(" ");
            try {
                n = input.nextInt();
                check = true;
            } catch (Exception e) {
                System.out.println("Ban phai nhap so! hay nhap lai...");
                input.nextLine();
            }
        }
        return (n);
    }

    public static boolean checkSNT(int n) {
        if (n > 1) {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public static void lietKeUocSNT(int n) {
        int count = 0;
        System.out.print("\nCac uoc nguyen to khac nhau cua " + n + " la:");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && (checkSNT(i))) {
                System.out.print(" " + i);
                count++;
            }
        }
        System.out.println("\n");
    }

   
}
