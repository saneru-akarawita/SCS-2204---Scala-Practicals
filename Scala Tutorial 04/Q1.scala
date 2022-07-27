object Q1 extends App{

    import scala.io.StdIn.readDouble;

    def interestFunc(x : Double):Double={
        if(x> 2000000)
            return x*6.5/100;
        else if(x>200000)
            return x*3.5/100;
        else if(x>20000)
            return x*4/100;
        else
            return x*2/100;
    }

    println("Please enter the deposit amount : ");
    println("Interest for the above amount is : "+ interestFunc(readDouble()));
    
}