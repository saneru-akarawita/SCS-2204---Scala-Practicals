object Q4 extends App{

    import scala.io.StdIn.readDouble;

    def oddEven(x :Double): Int ={

        if(x<=0){
            return 0;
        }
        else{
            if(x%2==0)
                return 2;
            else
                return 1;
        }
    }

    println("Enter a Value : ")
    var temp = oddEven(readDouble());

    temp match {
    case 0  => println("Negative/Zero is input");
    case 1  => println("Odd number is given")
    case 2  => println("Even number is given")
    }
    

}