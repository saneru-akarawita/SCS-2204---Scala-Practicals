object Q3a extends App{
    def LargeNum(x:Int,y:Int,z:Int):Int ={
        if(x>y){
            if(x>z)
                return x;
            else
                return z;
        }
        else{
            if(y>z)
                return y;
            else
                return z;
        }
    }

    println(LargeNum(13,4,1));
}


object Q3b extends App {

    def largeFromThree(x:Int,y:Int,z:Int):Int = if (x > y) (if(x > z)  x else z) else (if (y > z) y else z);

    println(largeFromThree(4,12,1));
}