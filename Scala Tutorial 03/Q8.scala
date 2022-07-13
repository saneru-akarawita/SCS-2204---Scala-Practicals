object Q8 extends App{

    def fartocel(far:Float):Float={
        var cel = 5*(far-32)/9;

        return cel;
    }

    def celtofar(cel:Float):Float={
        var far = (cel*9)/5 + 32;

        return far;
    }

    println("Enter a Temperature :")
    var num =  scala.io.StdIn.readFloat();

    println("converting "+ num + " from Far to Cel : "+ fartocel(num));

    println("converting "+ num + " from Cel to Far : "+ celtofar(num));
}