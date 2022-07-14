object Q4 extends App{

    val price = 24.95F;

    def discount(price:Float):Float=price*40/100;

    def cost(num:Int):Float = num match{

        case x if x<50 => num*3F;
        case _ => (num-50)*0.75F + 150;

    }

    def totcost(num:Int):Float = cost(num)+ num*(price - discount(price));

    println("Enter the Number of Books :");
    var num = scala.io.StdIn.readInt();
    println("The total Price for "+ num +" copies : "+ totcost(num));

}