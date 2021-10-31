package tuan4_5;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class BaiTap1 {
	public static void main(String[] args) {
		System.out.println("Họ tên: Lưu Thị Lương ");
        System.out.println("MSSV: 20181067");
        System.out.println("Lớp: SPKT-CNTT");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên đầy đủ: ");
        String n = scanner.nextLine();
        String []arr = n.split("");
        int count=0;
        List<String>fullName = new ArrayList<>();
        for(int i = 0 ; i <arr.length;i++){
            if(arr[0].equals(" ")&&i==0){
                for(int j=i+1;j< arr.length-1;j++){
                    if(!arr[j].equals(" ")){
                        i=j;
                        break;
                    }
                }
            }
            if(arr[i].equals(" ")){
                fullName.add(arr[i]);
                for(int j=i+1;j<arr.length-1;j++){
                    if(!arr[j].equals(" ")){
                        fullName.add(arr[j]);
                        i=j;
                        break;
                    }
                }
            }
            else{
                fullName.add(arr[i]);
            }
        }
        fullName.stream().forEach(s-> System.out.print(s));
    }
}


