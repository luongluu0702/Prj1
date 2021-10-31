package tuan4_5;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class BaiTap2 {
	public static void main(String[] args) {
		System.out.println("Họ tên: Lưu Thị Lương ");
        System.out.println("MSSV: 20181067");
        System.out.println("Lớp: SPKT-CNTT");
        Scanner scanner = new Scanner(System.in);
        String[]abc={"a","b","c"};
        System.out.println("Nhập dãy: ");
        String n = scanner.nextLine();
        String[] arr = n.split("");
        if (arr.length < 3) {
            System.out.println("Số lần xuất hiện: 0");
        } else {
            int count=0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals("a") && arr.length-i>=3) {
                    for (int j=0;j<3;j++){
                        if(!arr[i+1].equals(abc[j+1])){
                            break;
                        }
                        else{
                            ++count;
                        }
                    }

                }
            }
            System.out.println("Số dãy con là abc: "+count);
        }
    }

}
