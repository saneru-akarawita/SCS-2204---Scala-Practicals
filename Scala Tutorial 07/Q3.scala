class Account(id:String,n: Int, b: Double) {
     
     val nic:String=id;
     val acnumber:Int=n;
     var balance:Double=b;
     var flag=0;

     def transfer(acc:Account,amount:Double)= {

        if(this.balance-amount>0){
            this.balance=this.balance-amount;
            acc.balance=acc.balance+amount;
            flag=1;
        }
        else{
            println("Error. Insufficient Balance!")
        }
     }

}
   

object Q3{
   def main(args: Array[String]):Unit= {
   
       val a:Account=new Account("991234567V",1001,10000.00);
       val b:Account=new Account("982345675V",1002,12000.00);
        
       a.transfer(b,2000.00);

       if(a.flag!=0){
            println("Balance of b after transfered :"+b.balance);
            println("Balance of a after transfered :"+a.balance);
       }
      
   }
}