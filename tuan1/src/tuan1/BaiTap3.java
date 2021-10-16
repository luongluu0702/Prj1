package tuan1;
import java.util.*;
import java.lang.*;
public class BaiTap3 {

	 public static void main(String[] args) {
	        List<Integer> nguyento = songuyento(2000);
	        System.out.println("Họ tên: Lưu Thị Lương ");
	        System.out.println("MSSV: 20181067");
	        System.out.println("Lớp: SPKT-CNTT");
	        System.out.println("Kết quả: ");
	        for(int i = 0 ; i < nguyento.size(); i++){
	            System.out.print(nguyento.get(i)+" ");
	        }
	    }
	    public static boolean nhap(int n){
	        if(n<0){
	            return true;
	        }
	        else{
	            return false;
	        }
	    }
	    public static List<Integer> songuyento(int n){
	        List<Integer>nt = new ArrayList<>();
	        for(int i =1001 ; i <n;i++){
	            boolean KT= true;
	            for(int j = 2; j <i ; j++){
	                if(i%j ==0){
	                    KT = false;
	                    break;
	                }
	            }
	            if(KT){
	                nt.add(i);
	            }
	        }
	        return nt;
	    }
	}

