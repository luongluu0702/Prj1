package tuan1;
import java.util.*;
import java.lang.*;
public class BaiTap5 {
	public static void main(String[] args) {
		System.out.println("Họ tên: Lưu Thị Lương ");
        System.out.println("MSSV: 20181067");
        System.out.println("Lớp: SPKT-CNTT");
        System.out.println("Kết quả: ");
        for(int i = 1001 ; i< 2000 ; i ++){
            if(i%3==0 && i%7==0 && i%5==0){
                System.out.println(i);
            }
        }
    }
}
