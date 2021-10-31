package tuan4_5;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class BaiTap3 {
	public static void main(String[] args) {
		System.out.println("Họ tên: Lưu Thị Lương ");
        System.out.println("MSSV: 20181067");
        System.out.println("Lớp: SPKT-CNTT");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên đầy đủ: ");
        String n = scanner.nextLine();
        String[] arr = n.split("");
        for(int i = arr.length-1; i>0;i--){
            if(arr[i].equals(" ")){
                for(int j=i+1;j<arr.length;j++){
                    System.out.print(arr[j]);
                }
                break;
            }
        }
    }

}
