package tuan4_5;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class BaiTap7 {
	public static void main(String[] args) {
		System.out.println("Họ tên: Lưu Thị Lương ");
	    System.out.println("MSSV: 20181067");
	    System.out.println("Lớp: SPKT-CNTT");
        System.out.println("Nhập xâu kí tự:");
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        String[] arr = n.split("");
        System.out.println("Xâu ban đầu: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            if(isCheckKyTu(arr[i])){
                arr[i]="$";
            }
        }
        System.out.println("");
        System.out.println("Xâu lúc sau: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static boolean isCheckKyTu(String input){
        String mang[]={"1","2","3","4","5","6","7","8","9","0"};
        for(int i =0;i<mang.length;i++){
            if(input.equals(mang[i])){
                return true;
            }
        }
        return false;
    }

}
