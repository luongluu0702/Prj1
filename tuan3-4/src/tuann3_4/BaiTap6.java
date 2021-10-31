package tuann3_4;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class BaiTap6 {
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

        for(int i = 0 ; i < b.length;i++){
            if(b[i]==1){
                c.add(b[i]);
                continue;
            }
            for(int j=0;j<b.length;j++){
                if(b[i]==b[j]){
                    continue;
                }
                if(b[j]%b[i]==0&&b[i]!=b[j]){
                    c.add(b[i]);
                }
            }
        }
        c=c.stream().sorted().collect(Collectors.toList());
        for(int i = 0 ; i <c.size()-1;i++){
            for(int j=i+1;j<c.size();j++){
                if(c.get(i)==c.get(j)){
                    c.set(j,0);
                }
            }
        }
        System.out.print("Kết quả: ");
        c.stream().filter(i->i!=0).forEach(s-> System.out.print( s+" "));
    }
}
