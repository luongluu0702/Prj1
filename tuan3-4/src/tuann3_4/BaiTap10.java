package tuann3_4;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class BaiTap10 {
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
        c=c.stream().sorted().collect(Collectors.toList());
        int max = 1;
        List<Integer>d = new ArrayList<>();
        for(int i = 0 ; i < c.size()-1;i++){
            int count =1;
            for(int j=i+1;j<c.size();j++){
                if(c.get(j)!=c.get(i)){
                    break;
                }
                else{
                    ++count;
                }
            }
            if(max<count){
                max=count;
                d.add(c.get(i));
                d.add(max);
            }

        }
        for(int i=1;i<d.size();i+=2){
            if(max==d.get(i)){
                System.out.println("Số lượng các số trong dãy: "+max );
                System.out.println("Chỉ số đầu tiên: "+d.get(i-1));
                break;
            }
        }
        
        
	}
}
