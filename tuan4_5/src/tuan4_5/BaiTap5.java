package tuan4_5;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class BaiTap5 {
	public static void main(String[] args) {
	System.out.println("Họ tên: Lưu Thị Lương ");
    System.out.println("MSSV: 20181067");
    System.out.println("Lớp: SPKT-CNTT");
	Scanner scanner = new Scanner(System.in);
    System.out.println("Nhập sau kí tự:");
    String n = scanner.nextLine();
    String[]a=n.split("");
    System.out.println("Xâu ban đầu ");
    for(int i=0;i<a.length;i++){
        System.out.print(a[i]);
    }
    System.out.println("\n");
    for(int i=0;i<a.length;i++){
        if(a[i].equals("0")){
            a[i]="1";
        }
        else if(a[i].equals("1")){
            a[i]="0";
        }
    }
    System.out.println("Xâu lúc sau:");
    for(int i=0;i<a.length;i++){
        System.out.print(a[i]);
    }
}

}
