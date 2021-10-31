package tuann3_4;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class BaiTap12 {
	public static void main(String[] args) {
		System.out.println("Họ tên: Lưu Thị Lương ");
	    System.out.println("MSSV: 20181067");
	    System.out.println("Lớp: SPKT-CNTT");
	    Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài số A:");
        int n = scanner.nextInt();
        int[] dayA = new int[n];
        System.out.println("Nhập dãy số A:");
        for(int i = 0 ; i <  n; i ++){
            int nhap = scanner.nextInt();
            dayA[i] = nhap;
        }
        System.out.println("Nhập độ dài số B:");
        int m = scanner.nextInt();
        System.out.println("Nhập dãy số B:");
        int[] dayB= new int[m];

        for(int i = 0 ; i < m ; i ++){
            int nhap = scanner.nextInt();
            dayB[i] = nhap;
        }

        if(isContains(dayA,dayB)){
            System.out.println("A là dãy con của B");
        }
        else{
            System.out.println("A không là dãy con của B");
        }
    }



    public static boolean isContains(int[]a , int[]b){
        boolean result = false;
        int sizeA = a.length;
        int sizeB= b.length;
        if(sizeA>sizeB){
            return result;
        }
        for(int i=0;i<sizeB;i++){
            if(b[i]==a[0] && (sizeB-i)>=sizeA){
                int k=i;
                for(int j=0;j<sizeA;j++){
                    if(a[j]==b[k]){
                        result = true;
                        ++k;
                    }
                    else{
                        break;
                    }
                }
            }
        }
        System.out.println(result);
        return result;
    }
}
