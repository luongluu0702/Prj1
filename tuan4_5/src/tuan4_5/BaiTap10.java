package tuan4_5;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class BaiTap10 {
	public static void main(String[] args) {
		System.out.println("Họ tên: Lưu Thị Lương ");
	    System.out.println("MSSV: 20181067");
	    System.out.println("Lớp: SPKT-CNTT");
        System.out.println("Nhập số xâu kí tự:");       
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        List<String> arr = new ArrayList<String>();
        for(int i=1; i<=n; i++) {
        	System.out.println("Nhập xâu kí tự thứ "+i);
        	Scanner scanner1 = new Scanner(System.in);
            String n1= scanner1.next();
        	arr.add(n1) ;
        }
//        System.out.print(arr);
        Map<Integer,String>stringMap = new HashMap<>();
        int max = arr.get(0).length();
        for(int i=1;i < arr.size();i++){
            if(max < arr.get(i).length()){
                max = arr.get(i).length();
                stringMap.put(1,arr.get(i));
            }
        }
        System.out.println("Xâu có độ dài nhất là: "+stringMap.get(1));
    }

}
