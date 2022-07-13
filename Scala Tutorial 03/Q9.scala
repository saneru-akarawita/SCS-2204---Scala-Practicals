object Q9 extends App{

    def add(x:Float, y:Float):Float=x+y;
    def sub(x:Float, y:Float):Float=x-y;
    def mul(x:Float, y:Float):Float=x*y;
    def div(x:Float, y:Float):Any=if(y!=0) (x/y) else "Division by Zero";

    while(true){
        println("Welcome to Pocket Calculator :");
        println("Pls. Enter Number 1 :");
        var num1 = scala.io.StdIn.readFloat();
        println("Pls. Enter Number 2 :");
        var num2 = scala.io.StdIn.readFloat();

        println("Please select an action to perform :");
        println("\t\t 1. Addition");
        println("\t\t 2. Substraction");
        println("\t\t 3. Multiplication");
        println("\t\t 4. Division");

        var op = scala.io.StdIn.readByte();

        if(op==1)
            println("The addition : "+ add(num1,num2))
        else if(op==2)
            println("The substraction : "+ sub(num1,num2))
        else if(op==3)
            println("The multiplication : "+ mul(num1,num2))
        else if(op==4)
            println("The division : "+ div(num1,num2))
        else
            println("Invalid Option");

    }
    

}