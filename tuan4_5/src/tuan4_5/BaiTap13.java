package tuan4_5;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class BaiTap13 {
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
	    	String[] s= arr.get(i).split("\\s");
	    	String s1 = s[s.length-1];
	    	if(s1.indexOf("H")==0) {
	    		count+=1;  				
	    	}
        }
        System.out.println("Số bạn có tên bắt đầu bằng H: "+count);

    }


}
