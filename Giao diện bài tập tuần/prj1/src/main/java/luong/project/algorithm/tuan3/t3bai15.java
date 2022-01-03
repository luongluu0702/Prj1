package luong.project.algorithm.tuan3;

import luong.project.entity.Exercise;

public class t3bai15 extends Exercise {

    public t3bai15(){
        this.setTitle("Cho trước 2 xâu ký tự S, S2. Hãy chèn xâu S1 vào giữa xâu S2 và in kết quả." +
                "S1 = Lương ; S2= Lưu" );
        this.setCheckInput(false);
    }


    public Exercise handle(){
        Exercise exercise = new Exercise();
        String S1= "Lương";
        String S2= "Lưu";
        int tb = S2.length()/2;
        String a1 = S2.substring(0,tb+1);
        String a2=  S2.substring(S2.length()-tb);
        String output =a1+S1+a2;
        exercise.setDataOutput(output);
        return exercise;
    }
}
