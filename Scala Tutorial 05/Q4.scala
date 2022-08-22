import scala.io.StdIn._

object Q4 extends App{

    def isEven(num:Int):Boolean={

        if(num==0){
                return true;
        }
        else if(num==1){
                return false;
        }
        else if(num<0){
                return isEven(-num);
        }
        else
        return isEven(num-2);

    }



  print("Enter a Number : ")
  var n=readInt()

  if(isEven(n))
    println("Even")
else
    println("Odd")

}
