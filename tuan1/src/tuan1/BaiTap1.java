package tuan1;
import java.util.*;
import java.lang.*;
public class BaiTap1 {
	 public static void main(String[] args) {     
	        List<Integer> number = hopto(100);
	        System.out.println("Họ tên: Lưu Thị Lương ");
	        System.out.println("MSSV: 20181067");
	        System.out.println("Lớp: SPKT-CNTT");
	        System.out.println("Kết quả: ");
	        for(int i = 0 ; i < number.size(); i++){
	            System.out.print(number.get(i)+" ");
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
	  public static List<Integer> hopto(int n){
	        List<Integer>nt = new ArrayList<>();
	        for(int i =2 ; i <n;i++){
	            boolean KT= false;
	            for(int j = 2; j <i ; j++){
	                if(i%j ==0){
	                    KT = true;
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

	