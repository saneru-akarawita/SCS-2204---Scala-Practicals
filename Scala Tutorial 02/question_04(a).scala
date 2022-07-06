import scala.io.StdIn.readInt;


object question_04_a {  
    def main(args:Array[String])={ 

	def wage(hours:Int):Int=hours*250

	def ot(hours:Int):Int=hours*85

	def income(h1:Int,h2:Int):Int=wage(h1)+ot(h2)

	def tax(income:Int):Double=income*.12

	def takeHome(h1:Int,h2:Int):Double= income(h1,h2)-tax(income(h1,h2))
	
	println("Enter Number of General Hours : ");
	var hours = readInt();
	println("Enter Number of OT Hours : ");
	var othours = readInt();

	println("The Take home salary is: " + takeHome(hours,othours));
       
    }  
} 