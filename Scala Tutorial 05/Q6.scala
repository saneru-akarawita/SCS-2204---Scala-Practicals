import scala.io.StdIn._
import scala.util.control.Breaks._

object Q6 extends App{

  def fib(n:Int):Int={
     
     if(n<=1)
        n
     else
        fib(n-1)+fib(n-2) 
     
  }
  
  def printFibo(n:Int,i:Int):Any={
    
      if(n==i)
          break
       else
         println(fib(i))
      printFibo(n,i+1)
      
}

  print("Enter a Number : ")
  var n=readInt()

  printFibo(n,0)

}