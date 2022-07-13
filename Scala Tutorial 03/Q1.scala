object Q1 extends App{

    def absVal(x:Int) : Int = {
        if(x>0)
            return x;
        else 
            return -x;
    }

    println(absVal(-67));
}
