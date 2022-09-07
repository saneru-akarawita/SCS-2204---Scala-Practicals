class Account(id:String, n:Int, b:Double){
    val nic:String = id
    val accNum:Int = n
    var balance:Double = b

    override def toString= "["+nic+" || "+accNum+" || "+balance+"]"
}

object Q4{

 def main(args: Array[String]):Unit= {
 
        val a:Account=new Account("991234567V",1001,-500.00);
        val b:Account=new Account("981234567V",1002,1200.00);
        val c:Account=new Account("971234567V",1003,-750.00);
        val d:Account=new Account("961234567V",1004,5500.00);
        
        var bank:List[Account]=List(a,b,c,d);
       
       //overdraft acc
        val overdraft = bank.filter(x=>x.balance<0)
        println("Over Draft Accounts : "+overdraft);
        
        
            // Sum
        var total = bank.map(x=>x.balance).reduce((x,y) => x+y)
        println("Total Balance = " +total)
        
        //interest
        bank.map(x=> if(x.balance>0) x.balance=x.balance*1.05 else x.balance=x.balance*1.1)
        println("With Interest :"+bank);}      
 }