import scala.io.StdIn._

object Q5 extends App{

  def evenTot(n:Int):Int={
     if(n%2==0){
        if(n==0)
           0
        else
           n+evenTot(n-1)
     }
     else{
        evenTot(n-1)
     }
     
  }



  print("Enter a Number : ")
  var n=readInt()

  println(evenTot(n))

}