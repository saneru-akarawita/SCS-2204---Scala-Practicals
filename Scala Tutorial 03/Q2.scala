object Q2a extends App {

    def largeNo(x:Int,y:Int):Int ={
        if (x>y)
            return x;
        else
            return y;

    }

    println(largeNo(4,6))
}

object Q2b extends App {

    def largeNumber(x:Int,y:Int):Int = if(x>y) x else y;

    println(largeNumber(5,19));
}