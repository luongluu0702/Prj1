package tuan1;
import java.util.*;
import java.lang.*;
public class BaiTap6 {

	public static void main(String[] args) {
		System.out.println("Họ tên: Lưu Thị Lương ");
        System.out.println("MSSV: 20181067");
        System.out.println("Lớp: SPKT-CNTT");
        System.out.println("Kết quả: ");
        for(int i = 1 ; i < 10000; i++) {
            int sum = 0;
            for(int j = 1 ; j <= i/2;j++){
                if(i%j==0){
                    sum+=j;
                }
            }
            if(i==1){
                System.out.println( i);
            }
            else if(sum == i){
                System.out.println(i);
            }
        }
    }
}
