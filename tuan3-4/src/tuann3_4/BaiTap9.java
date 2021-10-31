package tuann3_4;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class BaiTap9 {
	public static void main(String[] args) {
		System.out.println("Họ tên: Lưu Thị Lương ");
        System.out.println("MSSV: 20181067");
        System.out.println("Lớp: SPKT-CNTT");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài dãy số:");
        int n = scanner.nextInt();
        System.out.println("Nhập số: ");
        int b[] = new int[n];
        for (int i = 0; i < n; i++) {
            int nhap = scanner.nextInt();
            b[i] =nhap;
        }
        List<Integer> c = new ArrayList<>();
        for(int i=0;i<b.length;i++){
            c.add(b[i]);
        }
        System.out.println("Nhập số C");
        int soC = scanner.nextInt();
        System.out.println("Số các số bằng số C:");
        int count1=0;
        for(int i=0;i<c.size();i++){
            if(soC==c.get(i)){
            	count1+=1;
                
            }
        }
        System.out.println(count1);
        System.out.println("Số các số nhỏ hơn số C:");
        int count2=0;
        for(int i=0;i<c.size();i++){
            if(soC>c.get(i)){
            	count2 +=1;
                
            }
        }
        System.out.println(count2);
        System.out.println("Số các số lớn hơn số C:");
        int count3=0;
        for(int i=0;i<c.size();i++){
            if(soC<c.get(i)){
            	count3 +=1;
                
            }
        }
        System.out.println(count3);

    }
}
