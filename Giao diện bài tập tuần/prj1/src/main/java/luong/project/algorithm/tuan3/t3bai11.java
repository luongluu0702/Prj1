package luong.project.algorithm.tuan3;

import luong.project.entity.Exercise;
import java.util.*;
public class t3bai11 extends Exercise {

    public t3bai11(){
        this.setTitle("Cho danh sách họ tên đầy đủ học sinh. Hãy đếm xem có bao nhiêu bạn tên “An”. VD: "+
                "Nguyen Van An ; Luu Binh An ; Luu Hai An");
        this.setCheckInput(false);
    }

    public Exercise handle(){
        Exercise exercise = new Exercise();
        String s1 = "Nguyen Van An";
        String s2 = "Luu Binh An";
        String s3 = "Luu Hai An";
        int count=0;
        List<String> arr = Arrays.asList(s1,s2,s3);
        for(int i=0;i<arr.size();i++){
            if(arr.get(i).contains("An")){
                ++count;
            }
        }
        String output="Số bạn có tên An: "+count;
        exercise.setDataOutput(output);
        return exercise;
    }
}
