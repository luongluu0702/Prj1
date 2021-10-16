package tuan1;
import java.util.*;
import java.lang.*;
public class BaiTap11 {

    public static void main(String[] args) {
    	System.out.println("Họ tên: Lưu Thị Lương ");
        System.out.println("MSSV: 20181067");
        System.out.println("Lớp: SPKT-CNTT");
        System.out.println("Kết quả: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập dãy số:");
        int n = scanner.nextInt();
        String m = String.valueOf(n);
        String []b = m.split("");
        String arr1[] = new String[b.length];
        Random random = new Random();
        String[]arr2 = manglucsau(b);
        for(int i = 0 ; i  < b.length ; i++){
            int vitri = random.nextInt(arr2.length);
            arr1[i]=arr2[vitri];
            arr2[vitri]="0";
            arr2 = manglucsau(arr2);
        }
        System.out.println("Dãy số sau khi hoán đổi: ");
        for(int i=0;i< arr1.length;i++){
            System.out.print(arr1[i]);
        }
    }
    public static String[] manglucsau(String[]b){
        List<String>a = new ArrayList<>();
        for(int i= 0 ; i <b.length;i++){
            if(b[i]!="0"){
                a.add(b[i]);
            }
        }
        String arr2[] = new String[a.size()];
        for(int i = 0 ; i < a.size();i++){
        	arr2[i] = a.get(i);
        }
        return arr2;
    }

}
