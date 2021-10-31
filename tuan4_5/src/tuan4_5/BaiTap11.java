package tuan4_5;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class BaiTap11 {
	public static void main(String[] args) {
		System.out.println("Họ tên: Lưu Thị Lương ");
	    System.out.println("MSSV: 20181067");
	    System.out.println("Lớp: SPKT-CNTT");
	    System.out.println("Nhập số sinh viên :");       
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        List<String> arr = new ArrayList<String>();
        for(int i=1; i<=n; i++) {
        	System.out.println("Nhập SV thứ "+i);
        	Scanner scanner1 = new Scanner(System.in);
            String n1= scanner1.nextLine();
        	arr.add(n1) ;
        }
        int count =0;
	    for(int i=0;i<arr.size();i++){
	    	int a1 = arr.get(i).length();
	    	if(arr.get(i).lastIndexOf("An")== a1-2) {
	    		count+=1;
	    	}
        }
        System.out.println("Số bạn có tên An: "+count);

    }

}
