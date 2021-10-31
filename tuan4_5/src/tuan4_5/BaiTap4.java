package tuan4_5;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class BaiTap4 {
	public static void main(String[] args) {
		System.out.println("Họ tên: Lưu Thị Lương ");
        System.out.println("MSSV: 20181067");
        System.out.println("Lớp: SPKT-CNTT");
        System.out.println("Nhập tên đầy đủ: ");
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        String[] arr = n.split("");
        for(int i= 0; i< arr.length;i++){
            if(arr[i].equals(" ")){
                for(int j=0;j<i;j++){
                    System.out.print(arr[j]);
                }
                break;
            }
        }
    }

}
