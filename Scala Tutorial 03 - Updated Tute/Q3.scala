import scala.io.StdIn.readFloat;
import scala.math._;

object Q3 extends App{

    def sphereVol(r:Double):Double=4*Pi*math.pow(r,3)/3;

    println("Enter a Radius :")
    var num =  scala.io.StdIn.readDouble();

    println("volume of a sphere with radius " + num + " is : "+ sphereVol(num));
}