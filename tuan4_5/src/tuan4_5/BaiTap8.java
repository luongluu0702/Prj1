package tuan4_5;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class BaiTap8 {
	public static void main(String[] args) {
		System.out.println("Họ tên: Lưu Thị Lương ");
	    System.out.println("MSSV: 20181067");
	    System.out.println("Lớp: SPKT-CNTT");
        System.out.println("Nhập xâu kí tự:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập xâu ký tự S1: ");
        String n = scanner.nextLine();
        String[] xauA = n.split("");
        System.out.println("Nhập xâu ký tự S2: ");
        String n1 = scanner.nextLine();
        String[] xauB = n1.split("");
        boolean KT = true;
        int count=0;
        if(xauA.length > xauB.length){
            System.out.println("Xâu S1 không xuất hiện trong xâu S2 ");
        }
        else {
            for (int i = 0; i < xauB.length; i++) {
                if(xauB[i].equals(xauA[0]) && xauB.length >= xauA.length){
                    for(int j=0;j< xauA.length;j++){
                        if(!xauA[j].equals(xauB[i])){
                            KT=false;
                            break;
                        }
                        else{
                            i++;
                        }
                    }
                    if(KT){
                        ++count;
                    }
                }

            }
        }
        System.out.println("Số lần xuất hiện xâu S1 trong xâu S2 là: "+count);

    }
}
