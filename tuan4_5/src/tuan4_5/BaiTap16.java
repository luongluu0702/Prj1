package tuan4_5;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class BaiTap16 {
	public static void main(String[] args) {
		System.out.println("Họ tên: Lưu Thị Lương ");
	    System.out.println("MSSV: 20181067");
	    System.out.println("Lớp: SPKT-CNTT");
	    String xau1= "Lưu";
        String xau2= "LưuThi";
        boolean KT = true;
        for(int i=0;i<xau1.length();i++){
            if(!xau2.contains(xau1.split("")[i])){
                KT = false;
            }
        }
        if(KT){
            System.out.println("Xâu 1 là con của xâu 2!");
        }
        else{
            System.out.println("Xâu 1 không là con của xâu 1");
        }
    }

}
