class Rational(x:Int,y:Int) {
   var upnum=x;
   var downnum=y;
  
   
   def sub(r:Rational)={
       new Rational(upnum*r.downnum - r.upnum*downnum , downnum * r.downnum);
   }
   
 }
     
   

object Q2{
   def main(args: Array[String]):Unit= {
   
       val x:Rational=new Rational(3,4);
       val y:Rational=new Rational(5,8);
       val z:Rational=new Rational(2,7);
       
       var k:Rational=x.sub(y);
       var r:Rational=k.sub(z);
      
       println("If x = "+x.upnum+"/"+x.downnum+" ;")
       println("If y = "+y.upnum+"/"+y.downnum+" ;")
       println("If z = "+z.upnum+"/"+z.downnum+" ;")

       println("Then the Asnwers is: "+r.upnum+"/"+r.downnum);
      
       
   }
}