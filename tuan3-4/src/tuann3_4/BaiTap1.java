package tuann3_4;
import java.util.*;
public class BaiTap1 {
	public static void main(String[] args) {
        System.out.println("Họ và tên: Lương Thị Lương");
        System.out.println("MSSV : 20181067");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng:");
        int n = scanner.nextInt();
        System.out.println("Nhập dãy số:");
        List<Integer> c = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            int nhap = scanner.nextInt();
            c.add(nhap);
        }
        c.stream().sorted(new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        }).forEach(s-> System.out.print(s+" "));
    }
}
