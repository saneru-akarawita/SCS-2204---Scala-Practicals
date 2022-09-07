class Rational(x:Int,y:Int) {
   var upnum=x;
   var downnum=y;
   
   def neg()= new Rational(-upnum, downnum); 
}

object Q1 {

   def main(args: Array[String]):Unit = {

      val x:Rational = new Rational(3,4);

      var r:Rational=x.neg;
      println("The negative number of " + x.upnum+ "/"+ x.downnum + " is : " + r.upnum + "/" + r.downnum);
      
       
   }
}