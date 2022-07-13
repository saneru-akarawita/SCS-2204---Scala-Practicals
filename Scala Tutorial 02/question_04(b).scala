import scala.io.StdIn.readInt;

object question_04_b {  
    def main(args:Array[String])={ 

		def nop(tp:Int):Int={
			var number = 120 + (15-tp)*4;
			return number;
		}

		def income(tp:Int):Int={
			var res1 = nop(tp)*tp;
			return res1;
		}

		def expenses (tp:Int):Int={
			var cost = 500 + nop(tp)*3;
			return cost;
		}

		def profit(tp:Int):Int={
			var prof = income(tp)-expenses(tp);
			return prof;
		}

		while(true){
			println("Enter the ticket price : ");
			var value = readInt();
			println("Profit for Ticket Price " + value + " is : " + profit(value));
		}
       
    }  
} 
