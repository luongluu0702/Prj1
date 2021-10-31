package tuan4_5;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class BaiTap6 {
	public static void main(String[] args) {
		System.out.println("Họ tên: Lưu Thị Lương ");
	    System.out.println("MSSV: 20181067");
	    System.out.println("Lớp: SPKT-CNTT");
        System.out.println("Nhập sau kí tự:");
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        String[]a=n.split("");
        System.out.println("Xâu ban đầu");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
        System.out.println("");
        System.out.println("Xâu lúc sau:");
        for(int i=a.length-1;i>=0;i--){
            System.out.print(a[i]);
        }
    }


}
