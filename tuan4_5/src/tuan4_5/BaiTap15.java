package tuan4_5;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class BaiTap15 {
	public static void main(String[] args) {
		System.out.println("Họ tên: Lưu Thị Lương ");
	    System.out.println("MSSV: 20181067");
	    System.out.println("Lớp: SPKT-CNTT");
	    String S1= "Thị";
        String S2= "Lưu Lương";
        System.out.println("Chèn xâu S1 vào giữa xâuS2:");
        int tb = S2.length()/2;
        String a1 = S2.substring(0,tb);
        String a2=  S2.substring(S2.length()-tb-1);
        System.out.println(a1+S1+" "+a2);
    }

}
