package tuann3_4;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class BaiTap8 {
	public static void main(String[] args) {
		System.out.println("Họ tên: Lưu Thị Lương ");
        System.out.println("MSSV: 20181067");
        System.out.println("Lớp: SPKT-CNTT");
        System.out.println("Nhập độ dài dãy số:");
        Scanner scanner = new Scanner(System.in);
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
        c.stream().filter(s->s!=0).forEach(s-> System.out.println(s));
	}
}
