package tuann3_4;
import java.util.*;
public class BaiTap2 {
	public static void main(String[] args) {
		System.out.println("Họ tên: Lưu Thị Lương ");
        System.out.println("MSSV: 20181067");
        System.out.println("Lớp: SPKT-CNTT");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài dãy số:");
        int n = scanner.nextInt();
        System.out.println("Nhập dãy số: ");
        int b[] = new int[n];
        for(int i = 0 ; i < n ; i ++){
            int nhap = scanner.nextInt();
            b[i] = nhap;
        }
        List<Integer>c = new ArrayList<>();
        for(int i = 0 ; i < b.length ; i++){
            if(isCheck(b[i])){
                c.add(b[i]);
            };
        }
        System.out.println("Số nguyên tố của dãy này là: ");
        c.stream().forEach(s-> System.out.print(s +" "));
        
    }

    public static boolean isCheck(int input){
        boolean KT = true;
        if(input==1){
            KT=false;
            return KT;
        }
        for(int i=2; i<input;i++){
            if(input%i==0){
                KT=false;
                break;
            }
        }
        return KT;
        
    }
}
