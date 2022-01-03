package luong.project.algorithm.tuan3;

import luong.project.entity.Exercise;

public class t3bai16 extends Exercise {

    public t3bai16(){
        this.setTitle("Cho trước 2 xâu S1, S2. Hãy xét xem xâu S1 có phải là xâu con của S2 nếu xóa bỏ vài kí tự của xâu S2 ta được xâu S1."+
                "VD : S1=Luong ; S2=LuuThiLuong");
        this.setCheckInput(false);
    }

    public Exercise handle(){
        Exercise exercise = new Exercise();
        String xau1= "Luong";
        String xau2= "LuuThiLuong";
        boolean KT = true;
        for(int i=0;i<xau1.length();i++){
            if(!xau2.contains(xau1.split("")[i])){
                KT = false;
            }
        }
        String output ="Kết quả: ";
        if(KT){
            output+="Xâu 1 là con của xâu 2!";
        }
        else{
            output+="Xâu 1 không là con của xâu 1";
        }
        exercise.setDataOutput(output);
        return exercise;
    }
}
