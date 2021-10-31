package tuan4_5;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class BaiTap14 {
	public static void main(String[] args) {
		System.out.println("Họ tên: Lưu Thị Lương ");
	    System.out.println("MSSV: 20181067");
	    System.out.println("Lớp: SPKT-CNTT");
	    System.out.println("Nhập n :"); 
	    Scanner scanner = new Scanner(System.in);
	    int n= scanner.nextInt();
        List<String> arr = new ArrayList<String>();
        String S1="1111100000";
        arr.add(S1);
        System.out.println(arr);
        for(int i =0; i< n; i++) {
        	String[] arr1 = arr.get(i).split("");
        	System.out.println(arr1[3]);
        	String tmp = arr1[0];
        	for(int j=0; j< 9; j++) {
        		arr1[j]= arr1[j+1];
        	}
        	arr1[9]=tmp;
        	for(int k=0; k<10; k++) {        		
        		System.out.println(arr1[k]);
        	}
        }
        
	}
	
}