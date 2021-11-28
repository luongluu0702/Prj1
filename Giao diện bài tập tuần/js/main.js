
const weeks = document.querySelectorAll('.weeken');
const bts = document.querySelectorAll('.week')
const BT = document.querySelectorAll('.button-baitap')
const tip= document.querySelector('.tips')
const body = document.querySelector('.middlerBT')
const wk1 = document.querySelectorAll('.tuan1');
const wk2 = document.querySelectorAll('.tuan2');
const wk3 = document.querySelectorAll('.tuan3');
console.log(wk2)
for (var bt of BT) {   
    bt.addEventListener('click', function(e){
        tip.classList.add('close')
        body.classList.add('active--week')

        for ( var i of BT){
            if(i.classList.contains('avtive--baitap')){
                i.classList.remove('avtive--baitap');
            }
        }
        e.target.classList.add('avtive--baitap');
        if(e.target.classList.contains('w1-tp1')){
            for(var i of wk2){
                i.classList.remove('active--week')
            }
            for(var i of wk3){
                i.classList.remove('active--week')
            }
            for(var i of wk1){
                if(i.classList.contains('w1-tp1')){
                    i.classList.add('active--week')
                } else{
                    i.classList.remove('active--week')
                }
            }
        }else if(e.target.classList.contains('w1-tp2')){
            for(var i of wk2){
                i.classList.remove('active--week')
            }
            for(var i of wk3){
                i.classList.remove('active--week')
            }
            for(var i of wk1){
                if(i.classList.contains('w1-tp2')){
                    i.classList.add('active--week')
                } else{
                    i.classList.remove('active--week')
                }
            }
        } else if(e.target.classList.contains('w1-tp3')){
            for(var i of wk2){
                i.classList.remove('active--week')
            }
            for(var i of wk3){
                i.classList.remove('active--week')
            }
            for(var i of wk1){
                if(i.classList.contains('w1-tp3')){
                    i.classList.add('active--week')
                } else{
                    i.classList.remove('active--week')
                }
            }
        }
        else if(e.target.classList.contains('w1-tp4')){
            for(var i of wk2){
                i.classList.remove('active--week')
            }
            for(var i of wk3){
                i.classList.remove('active--week')
            }
            for(var i of wk1){
                if(i.classList.contains('w1-tp4')){
                    i.classList.add('active--week')
                } else{
                    i.classList.remove('active--week')
                }
            }
        }
        else if(e.target.classList.contains('w1-tp5')){
            for(var i of wk2){
                i.classList.remove('active--week')
            }
            for(var i of wk3){
                i.classList.remove('active--week')
            }
            for(var i of wk1){
                if(i.classList.contains('w1-tp5')){
                    i.classList.add('active--week')
                } else{
                    i.classList.remove('active--week')
                }
            }
        }
        else if(e.target.classList.contains('w1-tp6')){
            for(var i of wk2){
                i.classList.remove('active--week')
            }
            for(var i of wk3){
                i.classList.remove('active--week')
            }
            for(var i of wk1){
                if(i.classList.contains('w1-tp6')){
                    i.classList.add('active--week')
                } else{
                    i.classList.remove('active--week')
                }
            }
        }
        else if(e.target.classList.contains('w1-tp7')){
            for(var i of wk2){
                i.classList.remove('active--week')
            }
            for(var i of wk3){
                i.classList.remove('active--week')
            }
            for(var i of wk1){
                if(i.classList.contains('w1-tp7')){
                    i.classList.add('active--week')
                } else{
                    i.classList.remove('active--week')
                }
            }
        }
        else if(e.target.classList.contains('w1-tp8')){
            for(var i of wk2){
                i.classList.remove('active--week')
            }
            for(var i of wk3){
                i.classList.remove('active--week')
            }
            for(var i of wk1){
                if(i.classList.contains('w1-tp8')){
                    i.classList.add('active--week')
                } else{
                    i.classList.remove('active--week')
                }
            }
        }
        else if(e.target.classList.contains('w1-tp9')){
            for(var i of wk2){
                i.classList.remove('active--week')
            }
            for(var i of wk3){
                i.classList.remove('active--week')
            }
            for(var i of wk1){
                if(i.classList.contains('w1-tp9')){
                    i.classList.add('active--week')
                } else{
                    i.classList.remove('active--week')
                }
            }
        }
        else if(e.target.classList.contains('w1-tp10')){
            for(var i of wk2){
                i.classList.remove('active--week')
            }
            for(var i of wk3){
                i.classList.remove('active--week')
            }
            for(var i of wk1){
                if(i.classList.contains('w1-tp10')){
                    i.classList.add('active--week')
                } else{
                    i.classList.remove('active--week')
                }
            }
        }
        else if(e.target.classList.contains('w1-tp11')){
            for(var i of wk2){
                i.classList.remove('active--week')
            }
            for(var i of wk3){
                i.classList.remove('active--week')
            }
            for(var i of wk1){
                if(i.classList.contains('w1-tp11')){
                    i.classList.add('active--week')
                } else{
                    i.classList.remove('active--week')
                }
            }
        }
        else if(e.target.classList.contains('w1-tp12')){
            for(var i of wk2){
                i.classList.remove('active--week')
            }
            for(var i of wk3){
                i.classList.remove('active--week')
            }
            for(var i of wk1){
                if(i.classList.contains('w1-tp12')){
                    i.classList.add('active--week')
                } else{
                    i.classList.remove('active--week')
                }
            }
        }
        else if(e.target.classList.contains('w1-tp13')){
            for(var i of wk2){
                i.classList.remove('active--week')
            }
            for(var i of wk3){
                i.classList.remove('active--week')
            }
            for(var i of wk1){
                if(i.classList.contains('w1-tp13')){
                    i.classList.add('active--week')
                } else{
                    i.classList.remove('active--week')
                }
            }
        }
        else if(e.target.classList.contains('w1-tp14')){
            for(var i of wk2){
                i.classList.remove('active--week')
            }
            for(var i of wk3){
                i.classList.remove('active--week')
            }
            for(var i of wk1){
                if(i.classList.contains('w1-tp14')){
                    i.classList.add('active--week')
                } else{
                    i.classList.remove('active--week')
                }
            }
        }
        else if(e.target.classList.contains('w1-tp15')){
            for(var i of wk2){
                i.classList.remove('active--week')
            }
            for(var i of wk3){
                i.classList.remove('active--week')
            }
            for(var i of wk1){
                if(i.classList.contains('w1-tp15')){
                    i.classList.add('active--week')
                } else{
                    i.classList.remove('active--week')
                }
            }
        }
        else if(e.target.classList.contains('w1-tp16')){
            for(var i of wk2){
                i.classList.remove('active--week')
            }
            for(var i of wk3){
                i.classList.remove('active--week')
            }
            for(var i of wk1){
                if(i.classList.contains('w1-tp16')){
                    i.classList.add('active--week')
                } else{
                    i.classList.remove('active--week')
                }
            }
        }
        else if(e.target.classList.contains('w2-tp1')){
            for(var i of wk1){
                i.classList.remove('active--week')
            }
            for(var i of wk3){
                i.classList.remove('active--week')
            }
            for(var i of wk2){
                if(i.classList.contains('w2-tp1')){
                    i.classList.add('active--week')
                } else{
                    i.classList.remove('active--week')
                }
            }
        }
        else if(e.target.classList.contains('w2-tp2')){
            for(var i of wk1){
                i.classList.remove('active--week')
            }
            for(var i of wk3){
                i.classList.remove('active--week')
            }
            for(var i of wk2){
                if(i.classList.contains('w2-tp2')){
                    i.classList.add('active--week')
                } else{
                    i.classList.remove('active--week')
                }
            }
        }
        else if(e.target.classList.contains('w2-tp3')){
            for(var i of wk1){
                i.classList.remove('active--week')
            }
            for(var i of wk3){
                i.classList.remove('active--week')
            }
            for(var i of wk2){
                if(i.classList.contains('w2-tp3')){
                    i.classList.add('active--week')
                } else{
                    i.classList.remove('active--week')
                }
            }
        }
        else if(e.target.classList.contains('w2-tp4')){
            for(var i of wk1){
                i.classList.remove('active--week')
            }
            for(var i of wk3){
                i.classList.remove('active--week')
            }
            for(var i of wk2){
                if(i.classList.contains('w2-tp4')){
                    i.classList.add('active--week')
                } else{
                    i.classList.remove('active--week')
                }
            }
        }
        else if(e.target.classList.contains('w2-tp5')){
            for(var i of wk1){
                i.classList.remove('active--week')
            }
            for(var i of wk3){
                i.classList.remove('active--week')
            }
            for(var i of wk2){
                if(i.classList.contains('w2-tp5')){
                    i.classList.add('active--week')
                } else{
                    i.classList.remove('active--week')
                }
            }
        }
        else if(e.target.classList.contains('w2-tp6')){
            for(var i of wk1){
                i.classList.remove('active--week')
            }
            for(var i of wk3){
                i.classList.remove('active--week')
            }
            for(var i of wk2){
                if(i.classList.contains('w2-tp6')){
                    i.classList.add('active--week')
                } else{
                    i.classList.remove('active--week')
                }
            }
        }
        else if(e.target.classList.contains('w2-tp7')){
            for(var i of wk1){
                i.classList.remove('active--week')
            }
            for(var i of wk3){
                i.classList.remove('active--week')
            }
            for(var i of wk2){
                if(i.classList.contains('w2-tp7')){
                    i.classList.add('active--week')
                } else{
                    i.classList.remove('active--week')
                }
            }
        }
        else if(e.target.classList.contains('w2-tp8')){
            for(var i of wk1){
                i.classList.remove('active--week')
            }
            for(var i of wk3){
                i.classList.remove('active--week')
            }
            for(var i of wk2){
                if(i.classList.contains('w2-tp8')){
                    i.classList.add('active--week')
                } else{
                    i.classList.remove('active--week')
                }
            }
        }
        else if(e.target.classList.contains('w2-tp9')){
            for(var i of wk1){
                i.classList.remove('active--week')
            }
            for(var i of wk3){
                i.classList.remove('active--week')
            }
            for(var i of wk2){
                if(i.classList.contains('w2-tp9')){
                    i.classList.add('active--week')
                } else{
                    i.classList.remove('active--week')
                }
            }
        }
        else if(e.target.classList.contains('w2-tp10')){
            for(var i of wk1){
                i.classList.remove('active--week')
            }
            for(var i of wk3){
                i.classList.remove('active--week')
            }
            for(var i of wk2){
                if(i.classList.contains('w2-tp10')){
                    i.classList.add('active--week')
                } else{
                    i.classList.remove('active--week')
                }
            }
        }
        else if(e.target.classList.contains('w2-tp11')){
            for(var i of wk1){
                i.classList.remove('active--week')
            }
            for(var i of wk3){
                i.classList.remove('active--week')
            }
            for(var i of wk2){
                if(i.classList.contains('w2-tp11')){
                    i.classList.add('active--week')
                } else{
                    i.classList.remove('active--week')
                }
            }
        }
        else if(e.target.classList.contains('w2-tp12')){
            for(var i of wk1){
                i.classList.remove('active--week')
            }
            for(var i of wk3){
                i.classList.remove('active--week')
            }
            for(var i of wk2){
                if(i.classList.contains('w2-tp12')){
                    i.classList.add('active--week')
                } else{
                    i.classList.remove('active--week')
                }
            }
        }
        else if(e.target.classList.contains('w2-tp13')){
            for(var i of wk1){
                i.classList.remove('active--week')
            }
            for(var i of wk3){
                i.classList.remove('active--week')
            }
            for(var i of wk2){
                if(i.classList.contains('w2-tp13')){
                    i.classList.add('active--week')
                } else{
                    i.classList.remove('active--week')
                }
            }
        }
        else if(e.target.classList.contains('w3-tp1')){
            for(var i of wk1){
                i.classList.remove('active--week')
            }
            for(var i of wk2){
                i.classList.remove('active--week')
            }
            for(var i of wk3){
                if(i.classList.contains('w3-tp1')){
                    i.classList.add('active--week')
                } else{
                    i.classList.remove('active--week')
                }
            }
        }
        else if(e.target.classList.contains('w3-tp2')){
            for(var i of wk1){
                i.classList.remove('active--week')
            }
            for(var i of wk2){
                i.classList.remove('active--week')
            }
            for(var i of wk3){
                if(i.classList.contains('w3-tp2')){
                    i.classList.add('active--week')
                } else{
                    i.classList.remove('active--week')
                }
            }
        }
        else if(e.target.classList.contains('w3-tp3')){
            for(var i of wk1){
                i.classList.remove('active--week')
            }
            for(var i of wk2){
                i.classList.remove('active--week')
            }
            for(var i of wk3){
                if(i.classList.contains('w3-tp3')){
                    i.classList.add('active--week')
                } else{
                    i.classList.remove('active--week')
                }
            }
        }
        else if(e.target.classList.contains('w3-tp4')){
            for(var i of wk1){
                i.classList.remove('active--week')
            }
            for(var i of wk2){
                i.classList.remove('active--week')
            }
            for(var i of wk3){
                if(i.classList.contains('w3-tp4')){
                    i.classList.add('active--week')
                } else{
                    i.classList.remove('active--week')
                }
            }
        }
        else if(e.target.classList.contains('w3-tp5')){
            for(var i of wk1){
                i.classList.remove('active--week')
            }
            for(var i of wk2){
                i.classList.remove('active--week')
            }
            for(var i of wk3){
                if(i.classList.contains('w3-tp5')){
                    i.classList.add('active--week')
                } else{
                    i.classList.remove('active--week')
                }
            }
        }
        else if(e.target.classList.contains('w3-tp6')){
            for(var i of wk1){
                i.classList.remove('active--week')
            }
            for(var i of wk2){
                i.classList.remove('active--week')
            }
            for(var i of wk3){
                if(i.classList.contains('w3-tp6')){
                    i.classList.add('active--week')
                } else{
                    i.classList.remove('active--week')
                }
            }
        }
        else if(e.target.classList.contains('w3-tp7')){
            for(var i of wk1){
                i.classList.remove('active--week')
            }
            for(var i of wk2){
                i.classList.remove('active--week')
            }
            for(var i of wk3){
                if(i.classList.contains('w3-tp7')){
                    i.classList.add('active--week')
                } else{
                    i.classList.remove('active--week')
                }
            }
        }
        else if(e.target.classList.contains('w3-tp8')){
            for(var i of wk1){
                i.classList.remove('active--week')
            }
            for(var i of wk2){
                i.classList.remove('active--week')
            }
            for(var i of wk3){
                if(i.classList.contains('w3-tp8')){
                    i.classList.add('active--week')
                } else{
                    i.classList.remove('active--week')
                }
            }
        }
        else if(e.target.classList.contains('w3-tp9')){
            for(var i of wk1){
                i.classList.remove('active--week')
            }
            for(var i of wk2){
                i.classList.remove('active--week')
            }
            for(var i of wk3){
                if(i.classList.contains('w3-tp9')){
                    i.classList.add('active--week')
                } else{
                    i.classList.remove('active--week')
                }
            }
        }
        else if(e.target.classList.contains('w3-tp10')){
            for(var i of wk1){
                i.classList.remove('active--week')
            }
            for(var i of wk2){
                i.classList.remove('active--week')
            }
            for(var i of wk3){
                if(i.classList.contains('w3-tp10')){
                    i.classList.add('active--week')
                } else{
                    i.classList.remove('active--week')
                }
            }
        }
        else if(e.target.classList.contains('w3-tp11')){
            for(var i of wk1){
                i.classList.remove('active--week')
            }
            for(var i of wk2){
                i.classList.remove('active--week')
            }
            for(var i of wk3){
                if(i.classList.contains('w3-tp11')){
                    i.classList.add('active--week')
                } else{
                    i.classList.remove('active--week')
                }
            }
        }
        else if(e.target.classList.contains('w3-tp12')){
            for(var i of wk1){
                i.classList.remove('active--week')
            }
            for(var i of wk2){
                i.classList.remove('active--week')
            }
            for(var i of wk3){
                if(i.classList.contains('w3-tp12')){
                    i.classList.add('active--week')
                } else{
                    i.classList.remove('active--week')
                }
            }
        }
        else if(e.target.classList.contains('w3-tp13')){
            for(var i of wk1){
                i.classList.remove('active--week')
            }
            for(var i of wk2){
                i.classList.remove('active--week')
            }
            for(var i of wk3){
                if(i.classList.contains('w3-tp13')){
                    i.classList.add('active--week')
                } else{
                    i.classList.remove('active--week')
                }
            }
        }
        else if(e.target.classList.contains('w3-tp14')){
            for(var i of wk1){
                i.classList.remove('active--week')
            }
            for(var i of wk2){
                i.classList.remove('active--week')
            }
            for(var i of wk3){
                if(i.classList.contains('w3-tp14')){
                    i.classList.add('active--week')
                } else{
                    i.classList.remove('active--week')
                }
            }
        }
        else if(e.target.classList.contains('w3-tp15')){
            for(var i of wk1){
                i.classList.remove('active--week')
            }
            for(var i of wk2){
                i.classList.remove('active--week')
            }
            for(var i of wk3){
                if(i.classList.contains('w3-tp15')){
                    i.classList.add('active--week')
                } else{
                    i.classList.remove('active--week')
                }
            }
        }
        else if(e.target.classList.contains('w3-tp16')){
            for(var i of wk1){
                i.classList.remove('active--week')
            }
            for(var i of wk2){
                i.classList.remove('active--week')
            }
            for(var i of wk3){
                if(i.classList.contains('w3-tp16')){
                    i.classList.add('active--week')
                } else{
                    i.classList.remove('active--week')
                }
            }
        }
        else if(e.target.classList.contains('w3-tp17')){
            for(var i of wk1){
                i.classList.remove('active--week')
            }
            for(var i of wk2){
                i.classList.remove('active--week')
            }
            for(var i of wk3){
                if(i.classList.contains('w3-tp17')){
                    i.classList.add('active--week')
                } else{
                    i.classList.remove('active--week')
                }
            }
        }

    })
}
    

for( var week of weeks)(
    week.addEventListener('click', function(e){
        tip.classList.remove('close')
        tip.classList.add('active--week')
        body.classList.remove('active--week')
        for ( var i of BT){
            if(i.classList.contains('avtive--baitap')){
                i.classList.remove('avtive--baitap');
            }
        }
        for ( var i of weeks){
           if(i.classList.contains('active')){
               i.classList.remove('active');
           }
        }
        e.target.classList.add('active');
        if(e.target.classList.contains('w1')){
            for( var i of bts){
                if(i.classList.contains('week-one')){
                    i.classList.add('active--week')
                }else {
                    i.classList.remove('active--week')
                }

            }

        } else if(e.target.classList.contains('w2')){
            // wk2.classList.add('active--week')
            // wk1.classList.remove('active--week')
            for( var i of bts){
                if(i.classList.contains('week-two')){
                    i.classList.add('active--week')
                  
                }else {
                    i.classList.remove('active--week')
                }

            }

        } else if(e.target.classList.contains('w3')){
            for( var i of bts){
                if(i.classList.contains('week-three')){
                    i.classList.add('active--week')
                }else {
                    i.classList.remove('active--week')
                }

            }

        }


    })
)
