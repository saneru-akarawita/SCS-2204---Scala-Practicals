object Q2 extends App{


    def celtofar(cel:Float):Float={
        var far = (cel*9)/5 + 32;

        return far;
    }

    println("Enter a Temperature :")
    var num =  scala.io.StdIn.readFloat();

    println("converting "+ num + " from Cel to Far : "+ celtofar(num));
}